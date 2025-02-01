package lab3;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner S7 = new Scanner(System.in);
        // Constants for ticket prices
        double pA,pB,pC,pD;//price
        pA = 20.0;
        pB = 15.0;
        pC= 10.0;
        pD = 5.0;
        int tA,tB,tC,tD;//tickets
        double iA,iB,iC,iD;//income
        // Prompt the user to enter the number of tickets sold for each class
        System.out.print("Enter the number of Class A tickets sold: ");
         tA = S7.nextInt();
        System.out.print("Enter the number of Class B tickets sold: ");
         tB = S7.nextInt();
        System.out.print("Enter the number of Class C tickets sold: ");
         tC = S7.nextInt();
        System.out.print("Enter the number of Class D tickets sold: ");
         tD = S7.nextInt();
        // Calculate the income from each class of seats
        iA = tA * pA;
        iB = tB * pB;
        iC = tC * pC;
        iD = tD * pD;
        // Calculate the total income
        double totalIncome = iA+iB+iC+iD;
        // Display the income from each class and the total income
        System.out.printf("Income from Class A tickets: $%.2f%n", iA);
        System.out.printf("Income from Class B tickets: $%.2f%n", iB);
        System.out.printf("Income from Class C tickets: $%.2f%n", iC);
        System.out.printf("Income from Class D tickets: $%.2f%n", iD);
        System.out.printf("Total income generated: $%.2f%n", totalIncome);
        S7.close();   
    }
}
