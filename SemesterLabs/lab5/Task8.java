package lab5;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner T8 = new Scanner(System.in);
        int countGreater = 0; // Variable to keep track of the count of elements greater than the previous one
        int previous = Integer.MIN_VALUE; // Initialize previous to a very small number to ensure the first comparison works

        System.out.println("Enter numbers in the sequence (end with 0):");

        while (true) {
            int number = T8.nextInt(); // Read the next number in the sequence

            if (number == 0) {
                break; // End the loop if the user enters 0
            }

            // Compare with the previous number (except for the first number)
            if (previous != Integer.MIN_VALUE && number > previous) {
                countGreater++; // Increment the count if the current number is greater than the previous one
            }

            previous = number; // Update previous to the current number for the next iteration
        }

        // Display the number of elements that are greater than the previous one
        System.out.println("The number of elements greater than the previous one is: " + countGreater);

        T8.close(); // Close the scanner to free resources
    }
}
