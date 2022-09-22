/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class IntegerManipulations {
    public static void main(final String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        c = c + 5;
        c = c * 10;
        a = 10;
        b = 3;
        c = a / b;

        System.out.println("c = " + c);

        c = a % b;
        System.out.println("c = " + c);

        c += 5;
        c *= 10;

    }
}
