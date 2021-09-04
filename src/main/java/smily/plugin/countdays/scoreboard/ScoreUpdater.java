package smily.plugin.countdays.scoreboard;


import jakarta.validation.constraints.NotNull;

public class ScoreUpdater extends DayScoreboard{ 
    
    /*
        Update score from DayScoreboard to current Score.

        if switcher is true, then score on scoreboard updates else
        if switcher false then it will turn off.

        arguments:
        switcher: determent if the method is activated or not.
    */
    public final void updateScore(@NotNull boolean switcher){
        if (switcher){
            score += 1;
        }
    }


    


}
