package homework22022020;

import java.util.Scanner;

//Write a java program that tell us that Input number is odd or even?
//HINT: use turnery operator (?:)

public class JP1 {

    //main method
    public static void main(String[] args) {
        //Object creation to call instance method in static area
        JP1 inst = new JP1();
        inst.oddeven();
    }

    public void oddeven() {
        int a;
        System.out.println("Input number: ");
        //scanner object creation
        Scanner num = new Scanner(System.in);
        a = num.nextInt();

        //using ternery operator
        String number = (a % 2 == 0) ? " Input number is EVEN" : " Input number is ODD";
        System.out.println(a + number);
    }
}


