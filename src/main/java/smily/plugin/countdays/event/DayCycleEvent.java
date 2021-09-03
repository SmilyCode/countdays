package smily.plugin.countdays.event;

import org.bukkit.World;

public class DayCycleEvent {
    private boolean night;
    private boolean morning;
    private boolean afternoon;
    private boolean nextDay;
    private long time;


    
    public boolean isNight() {
        return night;
    }

    public long getExactTime(World world) {
        return time = world.getTime();
    }

    public boolean isNextDay() {
        return nextDay;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public boolean isMorning() {
        return morning;
    }
}