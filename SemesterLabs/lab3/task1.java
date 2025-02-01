package lab3;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        double amount;
        int remainingCents;
    Scanner S1=new Scanner(System.in);
    //ask the user for amount (dollars) in decimal
    System.out.println("Enter a decimal value for Dollars and cents.");
    amount=S1.nextDouble();
    //converting into cents
    remainingCents=(int)(amount*100);
    //finding number of dollars
        int dollars = remainingCents / 100;
        remainingCents = remainingCents % 100;
    //Find the number of quarters
        int quarters = remainingCents / 25;
        remainingCents = remainingCents % 25;
    //Find the number of dimes
        int dimes = remainingCents / 10;
        remainingCents = remainingCents % 10;
    //Find the number of nickels
        int nickels = remainingCents / 5;
        remainingCents = remainingCents % 5;
    //The remaining cents are pennies
        int pennies = remainingCents;
        // Step 8: Display the result
        System.out.println("Your amount " + amount + " consists of:");
        System.out.println("  Dollars: " + dollars);
        System.out.println("  Quarters: " + quarters);
        System.out.println("  Dimes: " + dimes);
        System.out.println("  Nickels: " + nickels);
        System.out.println("  Pennies: " + pennies);
        S1.close();
    }
}

