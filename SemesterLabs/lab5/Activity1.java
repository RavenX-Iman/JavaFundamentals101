package lab5;
import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args) {
        Scanner A1 = new Scanner(System.in);
        int num1,num2,answer;
        num1= (int)(Math.random()*10);
        num2=(int)(Math.random()*10);
        System.out.println("What is "+num1+" + "+num2+" ?");
        answer=A1.nextInt();
        while (num1+num2!=answer) {
            System.out.println("Wrong Answer!Try Again.");;
            System.out.println("What is "+num1+" + "+num2+" ?");
            answer=A1.nextInt();
        }
        System.out.println("You Got it!");
        A1.close();
    }
    
}
