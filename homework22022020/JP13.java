package homework22022020;

/*Write a Java program which input any number between 1 to 7
and it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”*/

import java.util.Scanner;

public class JP13 {

    //main method
    public static void main(String[] args) {
        //object creation to call instance method to static space
        JP13 ins = new JP13();
        ins.daysofweek();
    }

    //instance method to call days of week by numbers 1 to 7
    public void daysofweek() {
        //scanner object creation
        //scanner object creation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to call Days of week: ");
        int days = sc.nextInt();

        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
