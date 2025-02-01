package lab3;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        double payrate,hoursworked,totalhours,tax,clothes,supplies,bonds,parentcontribution;
        Scanner S6 = new Scanner(System.in);
        // Constants
        tax = 0.14;           // 14% tax rate
        clothes = 0.10;    // 10% for clothes
        supplies = 0.01;   // 1% for school supplies
        bonds = 0.25;      // 25% for savings bonds
        parentcontribution = 0.50; // Parents contribute $0.50 for each dollar spent on bonds

        // Prompt the user to enter pay rate and hours worked per week
        System.out.print("Enter your hourly pay rate: ");
        payrate = S6.nextDouble();

        System.out.print("Enter the number of hours you worked each week: ");
        hoursworked = S6.nextDouble();

        // Calculate total hours worked over five weeks
        totalhours = hoursworked * 5;

        // a. Calculate income before and after taxes
        double incomeBeforeTax = totalhours * payrate;
        double incomeAfterTax = incomeBeforeTax * (1 - tax);

        // b. Calculate the money spent on clothes and accessories
        double moneyForClothes = incomeAfterTax * clothes;

        // c. Calculate the money spent on school supplies
        double moneyForSupplies = incomeAfterTax * supplies;

        // Calculate remaining money after clothes and school supplies
        double remainingMoney = incomeAfterTax - moneyForClothes - moneyForSupplies;

        // d. Calculate the money spent to buy savings bonds
        double moneyForBonds = remainingMoney * bonds;

        // e. Calculate the money parents spend on additional savings bonds
        double parentContributionfinal = moneyForBonds * parentcontribution;
        // Output the results
        System.out.println("Income before taxes:"+ incomeBeforeTax);
        System.out.printf("Income after taxes: $%.2f%n", incomeAfterTax);
        System.out.printf("Money spent on clothes and accessories: $%.2f%n", moneyForClothes);
        System.out.printf("Money spent on school supplies: $%.2f%n", moneyForSupplies);
        System.out.printf("Money spent on savings bonds: $%.2f%n", moneyForBonds);
        System.out.printf("Parents' contribution for savings bonds: $%.2f%n", parentContributionfinal);
        S6.close();
    }
}

