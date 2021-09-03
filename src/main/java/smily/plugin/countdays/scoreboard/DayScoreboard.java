package smily.plugin.countdays.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import jakarta.validation.constraints.NotNull;

public class DayScoreboard {
    @NotNull
    protected Scoreboard dayScoreboard;

    @NotNull
    protected Objective objective;

    @NotNull
    protected Score dayScore;

    @NotNull 
    protected int score;

    //create scoreboard
    void createScoreboard(){
        dayScoreboard = Bukkit.getScoreboardManager().getNewScoreboard();

        objective = dayScoreboard.registerNewObjective("Day", "dummy", "Hari");
        dayScore = objective.getScore("ke -");
        dayScore.setScore(score);
    }

    //set the scoreboard to player
    public void setScoreboardToPlayer(Player player){
        if (dayScoreboard != null){
            player.setScoreboard(dayScoreboard);
        } else {
            new NullPointerException("Scoreboard is null");
        }
    }
}
