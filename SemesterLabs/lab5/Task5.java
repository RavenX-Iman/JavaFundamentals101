package lab5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
         // Create a scanner object for user input
        Scanner T5 = new Scanner(System.in);
        // Initialize max to the smallest possible integer value
        int max = Integer.MIN_VALUE; 

        System.out.println("Enter a sequence of integers (end with 0):");
        while (true) { // Infinite loop to read the sequence
            int number = T5.nextInt(); // Read the next integer from the user

            if (number == 0) { // Check if the input number is 0
                break; // If it's 0, exit the loop
            }

            if (number > max) { // Check if the current number is larger than the current max
                max = number; // Update max if the current number is larger
            }
        }

        System.out.println("The largest number in the sequence is: " + max); // Output the largest number
        T5.close(); // Close the scanner to free resources

    }
}
