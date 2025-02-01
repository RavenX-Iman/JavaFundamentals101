package lab4;
import java.util.Scanner;
public class activity1 {
    public static void main(String[] args) {
        Scanner A1= new Scanner(System.in);
        int year;
        System.out.println("Enter an year:");
        year=A1.nextInt();
        boolean isleap = ((year%4 == 0 && year%100==0)|| (year%400 == 0));
        System.out.println(year+" is a leap year? "+isleap);
        A1.close();
    }
    
}
