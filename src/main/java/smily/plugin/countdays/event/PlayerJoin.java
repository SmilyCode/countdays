package smily.plugin.countdays.event;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import jakarta.validation.constraints.NotNull;
import smily.plugin.countdays.CountDaysManager;
import smily.plugin.countdays.PluginUtils;
import smily.plugin.countdays.config.PluginConfig;
import smily.plugin.countdays.scoreboard.DayScoreboard;
import smily.plugin.countdays.scoreboard.ScoreUpdater;

public class PlayerJoin implements Listener {
    private DayScoreboard dayScoreboard = new DayScoreboard();
    private DayCycleEvent dayCycleEvent = PluginUtils.context.getBean(DayCycleEvent.class);
    private ScoreUpdater scoreUpdater = new ScoreUpdater();
    @NotNull
    private PluginConfig pluginConfig = PluginUtils.context.getBean(PluginConfig.class);

    @EventHandler
    public void joinEven(PlayerJoinEvent e){
        Player player = e.getPlayer();

        dayScoreboard.getDayScore().setScore(pluginConfig.getYamlVariable().getScore());
        dayScoreboard.displayScoreboard(player);
        dayCycleEvent.setWorld(player.getWorld());

        Bukkit.getScheduler().scheduleSyncRepeatingTask(CountDaysManager.getPlugin(), () -> 
        {
            scoreUpdater.updateScore(dayCycleEvent.isNextDay(), dayScoreboard.getDayScore(), 1);
            pluginConfig.getYamlVariable().setScore(dayScoreboard.getDayScore().getScore());
        }, 0, 20);
        
    }
    
}
