package lab3;
import java.util.Scanner;
public class task8 {
public static void main(String[] args) {
        int n;
        Scanner S8 = new Scanner(System.in);

        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Enter a number between 0 and 1000: ");
        n = S8.nextInt();

        // Ensure the number is within the valid range
        if (n < 0 || n > 1000) {
            System.out.println("Invalid number! Please enter a number between 0 and 1000.");
              // Exit the program if the number is out of range
        }
        // Extract each digit of the number and sum them
        int sum = 0;
        while (n> 0) {
            sum= sum + n % 10;  // Add the last digit to sum
            n= n/ 10;        // Remove the last digit from the number
        }

        // Display the sum of the digits
        System.out.println("The sum of the digits is " + sum);
        S8.close();
    }
}
