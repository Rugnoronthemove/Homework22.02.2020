package homework22022020;

//WAP to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class JP2 {

    //main method
    public static void main(String[] args) {
        System.out.println("Input year");
        //scanner object creation
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();

        String number = (a % 4 == 0) ? " is a Leap year" : " is not a Leap year";
        System.out.println(a + number);

        //using If-Else statement
        if (a % 4 == 0) {
            System.out.println(a + " is a leap year");
        } else {
            System.out.println(a + " is not a leap year");
        }
    }
}
