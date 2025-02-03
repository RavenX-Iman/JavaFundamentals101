package lab5;
import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        Scanner A5 = new Scanner(System.in); 
        int number, sum = 0;
             // Loop to get 5 numbers from the user
        for (int count = 0; count < 5; count++) {
            System.out.println("Enter a number:");
            number = A5.nextInt(); // Read each number
            sum += number; // Add it to the sum
            }
        System.out.println("The sum is " + sum);
        A5.close(); // Close the scanner
    }
}
