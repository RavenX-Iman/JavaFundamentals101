package lab5;
import java.util.Scanner;
public class Activity6 {
    public static void main(String[] args) {
        Scanner A6 = new Scanner(System.in);
        int num,max;
        System.out.println("Enter a number: ");
        num=A6.nextInt();
        max=num;
        do {
            System.out.println("Enter a number: ");
            num = A6.nextInt(); 
        if (num > max) 
            max = num;

        } while (num!=0);
        System.out.print("max is " + max+" and number " + num); 
        A6.close();
    }
}
