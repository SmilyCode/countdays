package smily.plugin.countdays.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import jakarta.validation.constraints.NotNull;

public class DayScoreboard {
    @NotNull
    private final Scoreboard dayScoreboard = Bukkit.getScoreboardManager().getNewScoreboard();

    @NotNull
    private final Objective objective = dayScoreboard.registerNewObjective("Day", "dummy", "Hari");

    @NotNull
    private final Score dayScore = objective.getScore("ke -");

    // displays scoreboard at spesified player
    public void displayScoreboard(Player player){
        if (dayScore.getScore() == 0){
            new NullPointerException("Score cannot be null.");
        }

        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        player.setScoreboard(dayScoreboard);
    }

    public Score getDayScore() {
        return dayScore;
    }

    public Scoreboard getDayScoreboard() {
        return dayScoreboard;
    }

    public Objective getObjective() {
        return objective;
    }
    
}
