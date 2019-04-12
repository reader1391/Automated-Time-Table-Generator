/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author egypt
 */
abstract class Session {
    
    protected int StartTime;
    protected int Duration;
    protected String day;

    abstract Room getRoom();
    abstract Teacher getTeacher();
    abstract boolean setTeacher(Teacher t);
    abstract boolean setRoom(Room r);

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
    
    public void setStartTime(int StartTime) {
        this.StartTime = StartTime;
    }

    public int getEndTime() {
        return StartTime + Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public int getStartTime() {
        return StartTime;
    }

    public int getDuration() {
        return Duration;
    }
}