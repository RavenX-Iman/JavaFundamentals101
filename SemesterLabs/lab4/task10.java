package lab4;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
    Scanner T10 = new Scanner(System.in);
        int purchased,points;
        System.out.print("Enter the number of books purchased this month: ");
        purchased = T10.nextInt();
        if (purchased == 0) {
            points = 0;
        } else if (purchased == 1) {
            points = 5;
        } else if (purchased == 2) {
            points = 15;
        } else if (purchased == 3) {
            points = 30;
        } else {
            points = 60;
        }
        System.out.println("You have earned " + points + " points this month.");
       T10.close();
    }
    
}
