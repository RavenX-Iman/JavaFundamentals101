package lab3;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        int k,n,get,remain;
        Scanner S2=new Scanner(System.in);
        System.out.println("Enter number of students:");
        n=S2.nextInt();
        System.out.println("Enter number of apples:");
        k=S2.nextInt();
        get=k/n;
        remain=k%n;
        System.out.println("Students will get: "+get+" apples");
        System.out.println(+remain+" apples wil remain in the basket.");
        S2.close();


    }
    

}
