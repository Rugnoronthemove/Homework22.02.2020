package homework22022020;

/* Write a java program to input student Name, roll No, and three subjects Math,
Science and English marks (marks is between 0 to 100 and if it is out of range print
error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage
and result. If he is pass or fail on basis of percentage (pass>=35) and also give them grade
>= 80 A+, >= 60 A, >= 50 B, >= 35 C, < 35 F And print Mark Sheet */

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Scanner;

public class JP3 {

    //main method
    public static void main(String[] args) {
        inputmarks();
        //JP3 inst = new JP3();
        //printmarksheet();
    }

    //static method to input data
    public static void inputmarks() {
        String name;
        int rollno;
        int maths;
        int science;
        int english;

        //Scanner object creation
        Scanner scan = new Scanner(System.in);
        System.out.print("Student Name: ");
        name = scan.next();
        System.out.print("Roll No: ");
        rollno = scan.nextInt();

        System.out.print("marks for Maths: ");
        maths = scan.nextInt();
        if (maths >= 0 && maths <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("marks for Maths: ");
            maths = scan.nextInt();
        }
        System.out.print("marks for Science: ");
        science = scan.nextInt();
        if (science >= 0 && science <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("marks for Science: ");
            science = scan.nextInt();
        }
        System.out.print("marks for English: ");
        english = scan.nextInt();
        if (english >= 0 && english <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("marks for English: ");
            english = scan.nextInt();
        }

        //declare variable for total
        int total;
        total = (maths + science + english);
        System.out.print("Total: ");
        System.out.println(total);

        //declare double variable for percentage
        double per = (double) total / 300 * 100;
        System.out.print("Percentage: ");
        System.out.println(per + " %");

        //pass or fail on basis of percentage (pass>=35)
        System.out.print("Result: ");
        if (per >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //give them grade >= 80 A+, >= 60 A, >= 50 B, >= 35 C, < 35 F
        System.out.print("Grade: ");
        if (per >= 80) {
            System.out.println("A+");
        } else if (per < 80 && per >= 60) {
            System.out.println("A");
        } else if (per < 60 && per >= 50) {
            System.out.println("B");
        } else if (per < 50 && per >= 35) {
            System.out.println("C");
        } else if (per < 35) {
            System.out.println("F");
        }

        //static method to printmarksheet
        //public static void printmarksheet() {

        System.out.println(" ______________________________________________ ");
        System.out.println("|                                              |");
        System.out.println("|                  Mark Sheet                  |");
        System.out.println("|______________________________________________|");
        System.out.println("|      Name                :        " + (name) + "      |");
        System.out.println("|      Roll No             :        " + (rollno) + "        |");
        System.out.println("|______________________________________________|");
        System.out.println("|      Subjects            :       Marks       |");
        System.out.println("|______________________________________________|");
        System.out.println("|      Maths               :       " + (maths) + "          |");
        System.out.println("|      Science             :       " + (science) + "          |");
        System.out.println("|      English             :       " + (english) + "          |");
        System.out.println("|______________________________________________|");
        System.out.println("|      Total               :       " + (total) + "         |");
        System.out.println("|______________________________________________|");
        System.out.println("|      Percentage          :       " + (per) + "%      |");
        System.out.print("|      Result              :       "); //+ "Pass" + "       |");
        if (maths >= 35 && science >= 35 && english >= 35) {
            System.out.println("Pass        |");
        } else {
            System.out.println("Fail        |");
        }
        System.out.print("|      Grade               :        ");
        if (per >= 80) {
            System.out.println("A+         |");
        } else if (per < 80 && per >= 60) {
            System.out.println("A          |");
        } else if (per < 60 && per >= 50) {
            System.out.println("B          |");
        } else if (per < 50 && per >= 35) {
            System.out.println("C          |");
        } else if (per < 35) {
            System.out.println("F          |");
        }
        System.out.println("|______________________________________________|");


    }
}


