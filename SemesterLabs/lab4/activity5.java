package lab4;
import java.util.Scanner;
public class activity5 {
    public static void main(String[] args) {
        int num;
        Scanner A5 = new Scanner(System.in);
        System.out.println("Enter 1,2 or 3:");
        num=A5.nextInt();
        switch (num) {
            case 1:
                System.out.println("You have entered 1");
                break;
            case 2:
                System.out.println("You have entered 2");
                break;
            case 3:
                System.out.println("You have entered 3");
                break;
            default:
                System.out.println("That's not a 1,2 or 3!");
                break;
        }
        A5.close();

    }
    
}
