package homework22022020;

//Write a Java program to calculate the average value of array elements.

public class JP19 {

    //main method
    public static void main(String[] args) {
        //object creation to call instance method in static area
        JP19 ins = new JP19();
        ins.averageofarray();
    }

    public void averageofarray() {
        System.out.println("Average value of array elements: ");
        //values of an array
        double[] a = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5};
        //sum of all array values
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            double average = sum / a.length;
            System.out.print(average + ", ");
        }
    }
}
