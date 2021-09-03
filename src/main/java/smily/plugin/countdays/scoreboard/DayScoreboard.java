package smily.plugin.countdays.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class DayScoreboard {
    protected Scoreboard dayScoreboard;
    protected Objective objective;
    protected Score dayScore;
    protected int score;

    void createScoreboard(){
        dayScoreboard = Bukkit.getScoreboardManager().getNewScoreboard();

        objective = dayScoreboard.registerNewObjective("Day", "dummy", "Hari");
        dayScore = objective.getScore("ke -");
        dayScore.setScore(score);
    }

    public void setToPlayer(Player player){
        if (dayScoreboard != null){
            player.setScoreboard(dayScoreboard);
        } else {
            new NullPointerException("Scoreboard is null");
        }
    }
}
