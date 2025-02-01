package lab4;
import java.util.Scanner;
public class activity2 {
    public static void main(String[] args) {
        Scanner A2 = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer: ");
        num=A2.nextInt();
        if(num%5==0){
            System.out.println("HiFive! ");
        }
        else if(num%2==0){
            System.out.println("HiEven! ");
        }
        else{
            System.out.println("The number is neither divisible by 5 nor by 2");
        }
        A2.close();
    }
}
