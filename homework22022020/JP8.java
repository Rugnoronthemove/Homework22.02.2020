package homework22022020;

/*Input any alphabet from a to f and print their city name accordingly (use if else) any other
Alphabet should be invalid entry*/

import java.util.Scanner;

public class JP8 {

    //main method
    public static void main(String[] args) {
        //object creation to call instance method in static area
        JP8 ins = new JP8();
        ins.citynames();
    }

    //instance method to call city name by alphabet entry
    public void citynames() {
        //scanner object creation
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any alphabet from A to F");
        char alpha = sc.next().charAt(0);
        if (alpha == 'A') {
            System.out.println("City starting with alphabet A: Ahmedabad");
        } else if(alpha == 'a') {
            System.out.println("City starting with alphabet a: Ahmedabad");
        } else if (alpha == 'B') {
            System.out.println("City starting with alphabet B: Berlin");
        } else if(alpha == 'b') {
            System.out.println("City starting with alphabet b: Berlin");
        } else if (alpha == 'C') {
            System.out.println("City starting with alphabet C: Cairo");
        }   else if (alpha == 'c') {
                System.out.println("City starting with alphabet c: Cairo");
        } else if (alpha == 'D') {
            System.out.println("City starting with alphabet D: Delhi");
        } else if (alpha == 'd') {
            System.out.println("City starting with alphabet d: Delhi");
        } else if (alpha == 'E') {
            System.out.println("City starting with alphabet E: Edinburgh");
        } else if (alpha == 'e') {
            System.out.println("City starting with alphabet e: Edinburgh");
        } else if (alpha == 'F') {
            System.out.println("City starting with alphabet F: Fuji");
        } else if (alpha == 'f') {
            System.out.println("City starting with alphabet f: Fuji");
        } else {
            System.out.println("Invalid entry try again with alphabets from A to F");
        }
    }
}
