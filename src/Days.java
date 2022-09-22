/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Days {
    public static void main(final String[] args) {
        int days = 5000;

        int years = days / 365;
        int months = (days % 365) / 31;
        int leftDays = days - years * 365 - months * 31;

        System.out.println("Total days = " + days);
        System.out.println("Total years = " + years);
        System.out.println("Total months = " + months);
        System.out.println("Left days = " + leftDays);
    }
}
