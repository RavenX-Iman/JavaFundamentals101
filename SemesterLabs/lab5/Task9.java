package lab5;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner T9 = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Display the menu of patterns
            System.out.println("\nChoose a pattern to print:");
            System.out.println("1. Rectangle Pattern");
            System.out.println("2. Right Half Pyramid");
            System.out.println("3. Left Half Pyramid");
            System.out.println("4. Pyramid");
            System.out.println("5. Pyramid Using Numbers");
            System.out.print("Enter your choice (1-5): ");
            int choice = T9.nextInt();

            // Ask for the number of rows for the pattern
            System.out.print("Enter the number of rows: ");
            int rows = T9.nextInt();

            // Print the chosen pattern based on user input
            switch (choice) {
                case 1:
                    // Rectangle Pattern
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= rows; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Right Half Pyramid
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Left Half Pyramid
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= rows - i; j++) {
                            System.out.print("  "); // Print spaces
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    // Pyramid
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= rows - i; j++) {
                            System.out.print(" "); // Print leading spaces
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    // Pyramid Using Same Numbers in Row
                   for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" "); // Print leading spaces
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i + " "); // Print the same number for the row
                    }
                    System.out.println();
                }
                break;

                default:
                    System.out.println("Invalid choice! Please select a number between 1 and 5.");
            }

            // Ask if the user wants to perform the operation again
            System.out.print("\nDo you want to print another pattern? (yes/no): ");
            String userResponse = T9.next();
            if (!userResponse.equalsIgnoreCase("yes")) {
                continueProgram = false; // Exit the loop
            }
        }

        System.out.println("Program terminated.");
        T9.close(); // Close the scanner

    }
}
