package lab5;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner T7 = new Scanner(System.in);
        int countEven = 0; // Variable to keep track of the number of even elements

        System.out.println("Enter numbers in the sequence (end with 0):");

        while (true) {
            int number = T7.nextInt(); // Read the next number in the sequence

            if (number == 0) {
                break; // End the loop if the user enters 0
            }

            // Check if the number is even
            if (number % 2 == 0) {
                countEven++; // Increment the count if the number is even
            }
        }
     // Display the number of even elements in the sequence
     System.out.println("The number of even elements in the sequence is: " + countEven);

     T7.close(); // Close the scanner to free resources
 }
}
