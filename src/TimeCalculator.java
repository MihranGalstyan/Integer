/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class TimeCalculator {
    public static void main(final String[] args) {
        int seconds = 172872;
        int secondsInMinute = 60;
        int secondsInHour = secondsInMinute * 60;
        int secondsInDay = secondsInHour * 24;

        int days = seconds / secondsInDay;
        int hours = (seconds % secondsInDay) / secondsInHour;
        int minutes = (seconds % secondsInDay) % secondsInHour / 60;
        int leftSeconds = ((seconds % secondsInDay) % secondsInHour) % 60;

        System.out.println("Days = " + days);
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Left seconds = " + leftSeconds);
    }
}
