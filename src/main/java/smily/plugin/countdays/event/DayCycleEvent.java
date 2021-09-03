package smily.plugin.countdays.event;

public class DayCycleEvent {
    private boolean night;
    private boolean morning;
    private boolean afternoon;
    private boolean nextDay;
    private Integer time;
    
    public boolean isNight() {
        return night;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
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