package homework22022020;

//Write a program that tells us input value is number or an alphabet or symbol

import java.util.Scanner;

public class JP12 {

    //main method
    public static void main(String[] args) {

        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any input: ");
        c = sc.next().charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("Input: " + c + " is an Alphabet");
        } else if ((c >= '0' && c <= '9')) {
            System.out.println("Input: " + c + " is an Number");
        } else {
            System.out.println("Input:" + c + " is Symbol");
        }
    }
}