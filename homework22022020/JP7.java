package homework22022020;

/*
WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */

import java.util.Scanner;

public class JP7 {

    //main method
    public static void main(String[] args) {
        //scanner object creation
        Scanner scan = new Scanner(System.in);
        //calling static method to static area
        calcommission();
    }

    //static method to calculate commission depending on sales amount
    public static void calcommission() {
        //scanner object creation
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales Id: ");
        String id = scan.next();
        System.out.println("Enter Seller's Name: ");
        String name = scan.next();
        System.out.println("Sales Amount: ");
        int sales = scan.nextInt();
        System.out.println("Salary Basic: ");
        int salary = scan.nextInt();
        System.out.println("Sales Commission Amount: ");
        if (sales >= 50000) {
            System.out.println(sales * 35 / 100);
        } else if (sales >= 30000) {
            System.out.println(sales * 20 / 100);
        } else if (sales >= 20000) {
            System.out.println(sales * 10 / 100);
        } else if (sales >= 10000) {
            System.out.println(sales * 5 / 100);
        } else if (sales < 10000) {
            System.out.println(sales * 2 / 100);
        }
    }
}
