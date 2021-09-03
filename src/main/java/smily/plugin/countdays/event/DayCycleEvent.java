package smily.plugin.countdays.event;

import org.bukkit.World;

public class DayCycleEvent {
    private World world;

    public DayCycleEvent(World world){
        this.world = world;
    }
    
    public boolean isNight() {
        long nightTimeStart = 18000;
        long nightTimeEnd = 23999;

        if (getExactTime(world) <= nightTimeStart || getExactTime(world) >=nightTimeEnd) return true; 
        else return false;
    }

    public long getExactTime(World world) {
        return world.getTime();
    }

    public boolean isNextDay() {
        return false;
    }

    public boolean isAfternoon() {
        return false;
    }

    public boolean isMorning() {
        return false;
    }
}