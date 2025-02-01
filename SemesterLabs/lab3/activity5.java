package lab3;
import java.util.Scanner;
public class activity5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchase=input.nextDouble();
        double tax=(purchase*6)/100;
        System.out.println("Sales tax is: $"+ (int)(tax*100)/100.0);
        input.close();
    }
}
