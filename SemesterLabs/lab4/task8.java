package lab4;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner T8 = new Scanner(System.in);
        int month,day,year;

        // Ask the user to input the month, day, and two-digit year
        System.out.print("Enter the month (in numeric form): ");
         month = T8.nextInt();

        System.out.print("Enter the day: ");
        day = T8.nextInt();

        System.out.print("Enter the two-digit year: ");
        year = T8.nextInt();

        // Check if the date is "magic"
        if (month * day == year) {
            System.out.println("The date is magic!");
        } else {
            System.out.println("The date is not magic.");
        }
        T8.close();

    }
}
