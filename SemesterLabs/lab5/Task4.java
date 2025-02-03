package lab5;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        Scanner T4 = new Scanner(System.in);
        System.out.println("Lab Task 4: Determine the Length of the Sequence");

        // Initialize a counter for the length of the sequence
        int length = 0;

        System.out.println("Enter the sequence of non-negative integers (end with 0):");
        
        // Read integers one by one and count until a 0 is encountered
        while (true) {
            int number = T4.nextInt();
            if (number == 0) {
                break; // Stop when 0 is encountered
            }
            length++;
        }

        // Output: Display the length of the sequence
        System.out.println("The length of the sequence is: " + length);
        System.out.println("Well done! You've successfully determined the sequence length!");

        // Close the scanner
        T4.close();
    }
}
