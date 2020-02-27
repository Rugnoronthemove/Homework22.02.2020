package homework22022020;

//Write a Java program to sum values of an array.

public class JP17 {

    //main method
    public static void main(String[] args) {
        //sumarray();
        //System.out.println(sumarray());
        //}

        //static method to carry out sum of an array
        //public static void sumarray() {
        //array declaration
        System.out.println("Sum of all values in array:");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //sum of all array values
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            System.out.print(sum + ", ");
        }
        //return sum;
    }
}