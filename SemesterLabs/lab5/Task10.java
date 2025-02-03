package lab5;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner T10 = new Scanner(System.in);
        // Prompt the user to enter the year
        System.out.print("Enter the year (e.g., 2013): ");
        int year = T10.nextInt();

        // Prompt the user to enter the first day of the year
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay =T10.nextInt();

        int currentDay = firstDay; // Initialize the current day to the first day of the year

        // Loop through each month and print the calendar
        for (int month = 1; month <= 12; month++) {
            // Print the month header based on the month number
            System.out.println();
            if (month == 1) {
                System.out.println("January " + year);
            } else if (month == 2) {
                System.out.println("February " + year);
            } else if (month == 3) {
                System.out.println("March " + year);
            } else if (month == 4) {
                System.out.println("April " + year);
            } else if (month == 5) {
                System.out.println("May " + year);
            } else if (month == 6) {
                System.out.println("June " + year);
            } else if (month == 7) {
                System.out.println("July " + year);
            } else if (month == 8) {
                System.out.println("August " + year);
            } else if (month == 9) {
                System.out.println("September " + year);
            } else if (month == 10) {
                System.out.println("October " + year);
            } else if (month == 11) {
                System.out.println("November " + year);
            } else if (month == 12) {
                System.out.println("December " + year);
            }

            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Determine the number of days in the current month
            int daysInMonth = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                daysInMonth = 31; // Months with 31 days
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30; // Months with 30 days
            } else if (month == 2) {
                // Check if it's a leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // February in a leap year
                } else {
                    daysInMonth = 28; // February in a non-leap year
                }
            }

            // Print spaces for the first day of the month
            for (int i = 0; i < currentDay; i++) {
                System.out.print("    ");
            }

            // Print each day of the month
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%3d ", day); // Print day with padding

                // If the current day is Saturday, start a new line
                if ((currentDay + day) % 7 == 0) {
                    System.out.println();
                }
            }

            // Update the current day to the next month's first day
            currentDay = (currentDay + daysInMonth) % 7;
            System.out.println(); // Add a blank line after each month
        }

        T10.close(); // Close the scanner to free resources
    }
}
