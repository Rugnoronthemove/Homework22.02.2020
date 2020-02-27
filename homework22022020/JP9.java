package homework22022020;

/*Input any alphabet from a to f and print their city name accordingly (use Switch statement) any other
Alphabet should be invalid entry*/

import java.util.Scanner;

public class JP9 {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet A to F to call City name: ");
        char city = sc.next().charAt(0);
        switch (city) {
            case ('a'):
            case ('A'):
                System.out.println("Ahmedabad");
                break;
            case ('b'):
            case ('B'):
                System.out.println("Berlin");
                break;
            case ('c'):
            case ('C'):
                System.out.println("Cairo");
                break;
            case ('d'):
            case ('D'):
                System.out.println("Delhi");
                break;
            case ('e'):
            case ('E'):
                System.out.println("Edinburgh");
                break;
            case ('f'):
            case ('F'):
                System.out.println("Fuji");
                break;
            default:
                System.out.println("Invalid entry try again with alphabets from A to F");
                break;
        }
    }
}
