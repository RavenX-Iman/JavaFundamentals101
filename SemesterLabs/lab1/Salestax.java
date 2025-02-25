import java.util.Scanner;
public class Salestax {
    public static void main(String[] args) {
           //creating a scanner object to read user input
    Scanner sc = new Scanner(System.in);
    //declaring variables
    double price;
    double tax;
    double  total;
    String item;
    final double tax_rate = 0.055;

    //displaying prompts and getting input
    System.out.println("item description:");
    item=sc.nextLine();
    System.out.println("price:");
    price= sc.nextDouble();
    sc.nextLine();  // Clear the newline from the buffer
    
    //calculations
    tax=price*tax_rate;
    total = price+tax;

    System.out.println(item+" is "+price+"$");
    System.out.println("tax is :"+tax+"$");
    System.out.println("Total after tax is "+total+"$");
        sc.close();
    }
    
}
