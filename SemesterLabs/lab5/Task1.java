package lab5;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner T1 = new Scanner(System.in);
        System.out.println("Welcome to the Lab Task Program!\n");

        // Task a: Print all numbers from A to B inclusively
        System.out.println("\nTask a: Print all numbers from A to B inclusively.");
        System.out.print("Enter A: ");
        int A = T1.nextInt();
        System.out.print("Enter B: ");
        int B = T1.nextInt();
        System.out.println("Here are the numbers from " + A + " to " + B + ":");
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nGreat job! You’ve listed all the numbers from A to B!\n");

        // Task b: Print all numbers from A to B in ascending or descending order
        System.out.println("\nTask b: Print all numbers from A to B in ascending or descending order.");
        System.out.print("Enter A: ");
        A = T1.nextInt();
        System.out.print("Enter B: ");
        B = T1.nextInt();
        if (A < B) {
            System.out.println("Here are the numbers from " + A + " to " + B + " in ascending order:");
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Here are the numbers from " + A + " to " + B + " in descending order:");
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nAwesome! You’ve displayed the numbers in the correct order!\n");

        // Task c: Sum of N numbers
        System.out.println("\nTask c: Sum of N numbers.");
        System.out.print("Enter the number of integers (N): ");
        int N = T1.nextInt();
        int totalSum = 0;
        System.out.println("Now, enter each number:");
        for (int i = 0; i < N; i++) {
            int number = T1.nextInt();
            totalSum += number;
        }
        System.out.println("The sum of the " + N + " numbers is: " + totalSum);
        System.out.println("Well done! You have calculated the total sum accurately!\n");

        // Task d: Sum of cubes from 1^3 to N^3
        System.out.println("\nTask d: Sum of cubes from 1^3 to N^3.");
        System.out.print("Enter N: ");
        N = T1.nextInt();
        int sumOfCubes = 0;
        for (int i = 1; i <= N; i++) {
            sumOfCubes += i * i * i;
        }
        System.out.println("The sum of cubes from 1^3 to " + N + "^3 is: " + sumOfCubes);
        System.out.println("Fantastic! You’ve computed the sum of cubes correctly!\n");

        // End of program
        System.out.println("\nCongratulations! You've successfully completed all the tasks. Keep up the great work!");
        T1.close();
    }
}
