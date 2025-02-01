package lab4;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner T5= new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter three numbers: ");
        num1=T5.nextInt();
        num2=T5.nextInt();
        num3=T5.nextInt();
        if ((num1 == num2)&&(num1 == num3)) {
            System.out.println("3");
        } else if ((num1==num2)||(num2==num3)||(num2==num3)) {
            System.out.println("2");
        } else {
            System.out.println("All are different! ");
        }
        T5.close();
    }
    
}
