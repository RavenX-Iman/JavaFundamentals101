package lab3;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int n;
        Scanner S4=new Scanner(System.in);
        // Prompt the user to enter the number of minutes since midnight
        System.out.print("Enter the number of minutes since midnight: ");
        n = S4.nextInt();

        // Calculate the number of hours and minutes
        int hours = (n / 60) % 24;// Calculate hours, wrap around 24 if necessary
        //The modulus operator % 24 ensures that the hours
        // wrap around after 23 (so it remains within the 24-hour format).
        int minutes = n % 60;// Remaining minutes after calculating hours

        // Print the result
        System.out.println(hours + ":" + minutes);
        S4.close();

    }
}