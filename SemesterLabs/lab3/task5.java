package lab3;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
       double capacity,costperliter,profitpercarton;
        Scanner S5=new Scanner(System.in);
        // Constants
        capacity= 3.78;  // Liters per carton
        costperliter = 0.38;   // Cost of producing one liter
        profitpercarton = 0.27; // Profit per carton
        // a. Prompt the user to enter the total amount of milk produced in liters
        System.out.print("Enter the total amount of milk produced (in liters): ");
        double totalmilk = S5.nextDouble();
        // b. Calculate the number of milk cartons needed (rounded to the nearest integer)
        int numberofcartons = (int)Math.round(totalmilk / capacity);
        // c. Calculate the cost of producing the milk
        double costofproduction = totalmilk * costperliter;
        // d. Calculate the profit for producing the milk
        double profit = numberofcartons * profitpercarton;
        // Output the results
        System.out.println("Number of milk cartons needed: " + numberofcartons);
        System.out.println("Cost of producing milk:$" +costofproduction);
        System.out.println("Profit from producing milk:$"+ profit);
        S5.close();
    }
}
