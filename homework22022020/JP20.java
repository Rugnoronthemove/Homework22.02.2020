package homework22022020;

//Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

import static com.sun.deploy.util.VersionString.contains;

public class JP20 {

    public static boolean contains(String[] city, String x) {
        for (String y : city) {
            if (x == y) {
                return true;
            }
        }
        return false;
    }

    //main method
    public static void main(String[] args) {

        System.out.println("Array contains a specific value:");
        String[] city = {"London", "Mumbai", "New York", "Hong Kong", "Singapore", "Dubai", "Sydney", "Montreal"};
        System.out.println(contains(city, "Hong Kong"));
        System.out.println(contains(city, "Delhi"));
    }
}


