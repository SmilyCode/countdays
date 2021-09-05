package smily.plugin.countdays.event;

import org.bukkit.World;

public class DayCycleEvent {
    private World world;
    private boolean nextDayDetector = false;

    public DayCycleEvent(World world){
        this.world = world;
    }

    public DayCycleEvent(){}
    
    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
    
    public long getExactTime() {
        return this.world.getTime();
    }    

    public boolean isNextDay() {
        if (isSunrise() || isMorning() || isNoon())
        { 
            if (nextDayDetector == true){
                nextDayDetector = false;
                return true;
            } else return false;
        }
        else
        { 
            nextDayDetector = true;
            return false;
        }
    }    
 
    public boolean isSunrise() {
        long sunriseTimeStart = 23000;
        long sunriseTimeEnd = 24000;

        if (getExactTime() >= sunriseTimeStart && getExactTime() <=sunriseTimeEnd) return true; 
        else return false;
    }
       
    public boolean isMorning() {
        long morningTimeStart = 0;
        long morningTimeEnd = 5999;
        
        if (getExactTime() >= morningTimeStart && getExactTime() <=morningTimeEnd) return true; 
        else return false;
    }    
    
    public boolean isNoon() {
        long noonTimeStart = 6000;
        long noonTimeEnd = 11999;
        
        if (getExactTime() >= noonTimeStart && getExactTime() <=noonTimeEnd) return true; 
        else return false;
    }   

    public boolean isSunset() {
        long sunsetTimeStart = 12000;
        long sunsetTimeEnd = 12999;

        if (getExactTime() >= sunsetTimeStart && getExactTime() <=sunsetTimeEnd) return true; 
        else return false;
    }    

    public boolean isNight() {
        long nightTimeStart = 13000;
        long nightTimeEnd = 17999;

        if (getExactTime() >= nightTimeStart && getExactTime() <=nightTimeEnd) return true; 
        else return false;
    }    

    public boolean isMidnight() {
        long midnightTimeStart = 18000;
        long midnightTimeEnd = 22999;

        if (getExactTime() >= midnightTimeStart && getExactTime() <=midnightTimeEnd) return true; 
        else return false;
    }
}