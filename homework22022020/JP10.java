package homework22022020;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import java.util.Scanner;

/*WAP to input any two number and ask user to enter their symbol (+, -, /, *) find addition,
 Subtraction, multiplication and division according to their symbol (using if else) */

public class JP10 {

    //main method
    public static void main(String[] args) {
        //object creation
        JP10 sc = new JP10();
        sc.symbolcal();
    }

    //instance method to carry out basic arithmetic operation of any 2 given numbers
    public void symbolcal() {

        System.out.println("Enter first number: ");
        //Scanner object creation
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();
        System.out.println("Enter symbol [+,-,/,*] of operation to be carried out: ");
        //String sym = scan.next();
        char sym = scan.next().charAt(0);
        if (sym == '+') {
            System.out.println("Addition: " + (a + b));
        } else if (sym == '-') {
            System.out.println("Substraction: " + (a - b));
        } else if (sym == '*') {
            System.out.println("Multiplication: " + (a * b));
        } else if (sym == '/') {
            System.out.println("Division: " + ((float)a / (float)b));
        } else {
            System.out.println("Operation is not valid");
        }
    }
}
