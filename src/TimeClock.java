package src;

/**
 * A class to act as a game clock for the "Summer Swing" application.
 *
 * @author Jacob Perrine
 * @version 2017.07.17
 */

public class TimeClock
{
    private int hour;
    private int minute;

    /**
     * Constructor for objects of class TimeClock
     */
    public TimeClock()
    {
        //The game-time will start at 10AM
        hour = 10;
        minute = 0;
    }

    /**
     * Increment the game clock by a certain number of minutes
     * 
     * @param timeSpent The amount of time to be added to the
     *                  game clock (in minutes)
     */
    public void incrementTime(int timeSpent)
    {
        minute = minute + timeSpent;
        
        if(minute > 59) {
            minute = minute - 60;
            hour++;
        }
    }
    
    /**
     * @return A String representing the current time
     *         format: "AA:BB" where AA = hour and BB = minute
     */
    public String timeToString()
    {
        if(minute < 10) {
            return hour + ":0" + minute;
        }
        
        return hour + ":" + minute;
    }
}
