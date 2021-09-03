package smily.plugin.countdays.event;

import org.bukkit.World;

public class DayCycleEvent {
    private World world;

    public DayCycleEvent(World world){
        this.world = world;
    }
    
    public long getExactTime(World world) {
        return world.getTime();
    }    

    public boolean isNextDay() {
        if (isSunrise() || isMorning() || isNoon()) return true;
        else return false;
    }    
 
    public boolean isSunrise() {
        long sunriseTimeStart = 23000;
        long sunriseTimeEnd = 24000;

        if (getExactTime(world) <= sunriseTimeStart || getExactTime(world) >=sunriseTimeEnd) return true; 
        else return false;
    }
       
    public boolean isMorning() {
        long morningTimeStart = 0;
        long morningTimeEnd = 5999;
        
        if (getExactTime(world) <= morningTimeStart || getExactTime(world) >=morningTimeEnd) return true; 
        else return false;
    }    
    
    public boolean isNoon() {
        long noonTimeStart = 6000;
        long noonTimeEnd = 11999;
        
        if (getExactTime(world) <= noonTimeStart || getExactTime(world) >=noonTimeEnd) return true; 
        else return false;
    }   

    public boolean isSunset() {
        long sunsetTimeStart = 12000;
        long sunsetTimeEnd = 12999;

        if (getExactTime(world) <= sunsetTimeStart || getExactTime(world) >=sunsetTimeEnd) return true; 
        else return false;
    }    

    public boolean isNight() {
        long nightTimeStart = 13000;
        long nightTimeEnd = 17999;

        if (getExactTime(world) <= nightTimeStart || getExactTime(world) >=nightTimeEnd) return true; 
        else return false;
    }    

    public boolean isMidnight() {
        long midnightTimeStart = 18000;
        long midnightTimeEnd = 22999;

        if (getExactTime(world) <= midnightTimeStart || getExactTime(world) >=midnightTimeEnd) return true; 
        else return false;
    }
}