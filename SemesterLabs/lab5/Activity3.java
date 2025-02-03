package lab5;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner A3 = new Scanner(System.in);
        final int sentinel = -999;
        int number,sum,count;
        sum=0;
        count=0;
        System.out.println("Enter positive integers ending with " + sentinel);
        number=A3.nextInt();
        while (number != sentinel) {
            sum = sum + number; 
            count++; 
            number = A3.nextInt(); 
        }
        System.out.printf("The sum of %d numbers = %d%n", count, sum);
        if (count != 0){
         System.out.printf("The average = %d%n", (sum / count));
        }else{
        System.out.println("No input.");
        }
        A3.close();
    }
}
