package smily.plugin.countdays;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import smily.plugin.countdays.config.PluginConfig;
import smily.plugin.countdays.event.DayCycleEvent;

public final class CountDays extends JavaPlugin {

    private PluginConfig pluginConfig; 
    private DayCycleEvent dayCycleEvent;

    @Override
    public void onEnable() {
        pluginConfig = new PluginConfig();
        pluginConfig.createDefaultConfig();
        pluginConfig.load();

        dayCycleEvent = new DayCycleEvent();
        Bukkit.getOnlinePlayers().forEach(player -> { 
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> {
                dayCycleEvent.setWorld(player.getWorld());
                System.out.println(dayCycleEvent.getExactTime());
                if (dayCycleEvent.isMorning()) {
                    player.sendMessage("Its Morning");
                } else
                if (dayCycleEvent.isSunrise()) {
                    player.sendMessage("Its Sunrise");
                } else
                if (dayCycleEvent.isNoon()) {
                    player.sendMessage("Its Noon");
                } else
                if (dayCycleEvent.isSunset()) {
                    player.sendMessage("Its Sunset");
                } else
                if (dayCycleEvent.isNight()) {
                    player.sendMessage("Its Night");
                } else
                if (dayCycleEvent.isMidnight()) {
                    player.sendMessage("Its Midnight");
                }
        },0, 200);} 
        );

    }

    @Override
    public void onDisable() {
        pluginConfig.writeAll();
        pluginConfig.override();
    }
}
