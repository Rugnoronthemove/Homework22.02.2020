package homework22022020;

//Write a Java program to sort a numeric array and a string
//array.

import java.util.Arrays;

public class JP16 {

    public static void main(String[] args) {
        //Array declaration for numbers
        int[] num = {1, 2, 4, 16, 20, -55, -89, 101, 105, 9, 6, 13};
        Arrays.sort(num);
        System.out.println("Sort Number: " + Arrays.toString(num));

        // Array declaration for string elements
        String[] name = {"Hemal", "Alpa", "Aarav", "Aruna", "Shailesh", "Kinjal"};
        Arrays.sort(name);
        System.out.println("Sort Names: " + Arrays.toString(name));
    }
}
