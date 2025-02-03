package lab5;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner T6 = new Scanner(System.in); // Create a scanner object for user input
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value
        int maxIndex = -1; // Initialize the index of the maximum value
        int currentIndex = 0; // Variable to keep track of the current index

        System.out.println("Enter a sequence of integers (end with 0):");
        while (true) { // Infinite loop to read the sequence
            int number = T6.nextInt(); // Read the next integer from the user

            if (number == 0) { // Check if the input number is 0
                break; // If it's 0, exit the loop
            }

            if (number > max) { // Check if the current number is larger than the current max
                max = number; // Update max if the current number is larger
                maxIndex = currentIndex; // Update the maxIndex to the current index
            }

            currentIndex++; // Increment the current index for the next number
        }

        if (maxIndex != -1) { // Check if maxIndex was updated from its initial value
            System.out.println("The index of the largest number in the sequence is: " + maxIndex);
        } else {
            System.out.println("No numbers were entered before 0.");
        }

        T6.close(); // Close the scanner to free resources
    }
}

