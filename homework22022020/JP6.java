package homework22022020;

//WAP to input any number and find out if it’s odd or even

import java.util.Scanner;

public class JP6 {

    //main method
    public static void main(String[] args) {
        oddeven();
    }

    //static method using If-Else statement to identify number odd or even
    public static void oddeven() {
        int a;
        System.out.println("Enter any number: ");
        //scanner object creation
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
    }
}

