package lab5;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner T2 = new Scanner(System.in);
        System.out.println("Lab Task 2: Calculate the Factorial of a Given Integer");

        // Input: Get the integer n from the user
        System.out.print("Enter a non-negative integer (n): ");
        int n = T2.nextInt();

        // Calculate the factorial
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Output: Display the factorial of n
        System.out.println("The factorial of " + n + " is: " + factorial);
        System.out.println("Well done! You have calculated the factorial correctly!");

        // Close the scanner
        T2.close();
    }
}