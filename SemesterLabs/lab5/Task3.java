package lab5;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lab Task 3: Count the Number of Zeros");

        // Input: Read the number of integers (N)
        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();

        // Initialize a counter for zeros
        int zeroCount = 0;

        // Read N integers and count the number of zeros
        System.out.println("Now, enter each integer:");
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                zeroCount++;
            }
        }

        // Output: Display the count of zeros
        System.out.println("The number of zeros among the given integers is: " + zeroCount);
        System.out.println("Great job! You've successfully counted the zeros!");

        // Close the scanner
        scanner.close();
    }
       
}
