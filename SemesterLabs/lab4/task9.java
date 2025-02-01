package lab4;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner T9 = new Scanner(System.in);
        double pennies,nickels,dimes,quarters;
        final double p_value,n_value,d_value,q_value;
        p_value=0.01;
        n_value=0.05;
        d_value=0.10;
        q_value=0.25;

        System.out.print("Enter the number of pennies: ");
        pennies = T9.nextDouble();
        System.out.print("Enter the number of nickels: ");
        nickels = T9.nextDouble();
        System.out.print("Enter the number of dimes: ");
        dimes = T9.nextDouble();
        System.out.print("Enter the number of quarters: ");
        quarters = T9.nextDouble();
       double total=(p_value*pennies)+(n_value*nickels)+(d_value*dimes)+(q_value*quarters);

        if (total == 1.00) {
            System.out.println("Congratulations! You entered exactly one dollar.");
        } else if (total > 1.00) {
            System.out.println("The amount you entered is more than one dollar.");
        } else {
            System.out.println("The amount you entered is less than one dollar.");
        }

        T9.close();
    }
    
}
