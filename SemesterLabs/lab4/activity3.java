package lab4;
import java.util.Scanner;
public class activity3 {
    public static void main(String[] args) {
        Scanner A3 = new Scanner(System.in);
        double wages, rate, hours;
        System.out.println("Enter the working hours:");
        hours=A3.nextDouble();
        System.out.println("Enter the payrate:");
        rate=A3.nextDouble();
        if(hours>40){//regular//calculates the wages for the overtime hours,
                                // which are paid at 1.5 times the normal rate.
            wages= (40.0*rate)+1.5*rate*(hours-40.0);
        }else{
            wages= hours*rate;
        }
        System.out.printf("The wages are :%.2f",wages);
        A3.close();

    }
}
