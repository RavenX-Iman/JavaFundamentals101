import java.util.Scanner;
public class pay {
    public static void main(String[] args) {
        //create a scanner object to read from keyboard
        Scanner S = new Scanner(System.in);
        //identifier declaration
        double hours;    //number of hours worked
        double payrate;  //hourly payrate
        double pay;  //grosspay
        //display prompts and get input
        System.out.println("How many hours worked? ");
        hours= S.nextDouble();
        System.out.println("Pay per hour? ");
        payrate= S.nextDouble();
        //calculations
        if (hours<=40) {
            pay= hours*payrate;
            
        } else { //overtime
            pay=(hours-40)*(1.5*payrate) + 40*payrate; //pay for 40 hours + pay for overtime 
        }
        //displaying result
        System.out.println("you have earned $"+ pay);
        S.close();

    }
}
