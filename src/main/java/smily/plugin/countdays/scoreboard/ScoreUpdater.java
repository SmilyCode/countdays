package smily.plugin.countdays.scoreboard;

import com.google.common.annotations.Beta;

import jakarta.validation.constraints.NotNull;
import net.md_5.bungee.api.ChatColor;

public class ScoreUpdater extends DayScoreboard{ 
    
    /*
        Update score from DayScoreboard to current Score.

        if switcher is true, then score on scoreboard updates else
        if switcher false then it will turn off.

        arguments:
        switcher: determent if the method is activated or not.
    */
    void updateScore(@NotNull boolean switcher){
        if (switcher){
            
        }
    }
    
    /*
        Change color default white to the desired color on every cooldown in second

        if no cooldown is wanted, set cooldown to 0
        if switcher is true, then score on scoreboard updates else
        if switcher false then it will turn off.

        argument:
        - color: change title to the desired color available
        - cooldown: cooldown for zig zag color between the changed color and default color
        - switcher: determent if the method is activated or not.
    */

    @Beta
    void changeTitleColor(@NotNull ChatColor color,@NotNull int cooldown, @NotNull boolean switcher){
        if (switcher){
            
        }
    }

    


}
