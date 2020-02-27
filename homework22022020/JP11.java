package homework22022020;

//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

public class JP11 {

    //main method
    public static void main(String[] args) {
        //object creation to call instance method to static area
        JP11 ins = new JP11();
        ins.divisiblebythree();
        ins.divisiblebyfive();
    }

    //instance method to list numbers from 1 to 100 divisible by 3
    public void divisiblebythree() {
        System.out.println("Number divided by 3:");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) ;
            System.out.print(i + ",");
        }
            //to create seperation between lines
            System.out.println("");
    }

    //instance method to list numbers from 1 to 100 divisible by 5
    public void divisiblebyfive() {
        System.out.println("Number divided by 5:");
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
    }
}
