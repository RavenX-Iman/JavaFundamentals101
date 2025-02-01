package lab4;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner T4= new Scanner(System.in);
        //a: minimum of 2 numbers
        int num1,num2,num3;
        System.out.println("Enter two integers:");
        num1=T4.nextInt();
        num2=T4.nextInt();

        int min1 = Math.min(num1, num2);
        System.out.println("The smaller value is: " + min1);

        //b: minimum of 2 numbers using conditionals
        int min2 =(num1 < num2)? num1: num2;
        System.out.println("The smaller value is: "+ min2);

        //c: sign function positive or negative
        System.out.println("Enter an integer (positive/negative):");
        int x = T4.nextInt();
        if (x>0) {
            System.out.println("1");
        } else if (x<0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
        //d: minimum of three integers
        System.out.println("Enter three integers:");
        num1=T4.nextInt();
        num2=T4.nextInt();
        num3=T4.nextInt();
        int min3 = Math.min(num1,Math.min(num2,num3));
        System.out.println("The smaller value is: " + min3);

        T4.close();
    }

    
}