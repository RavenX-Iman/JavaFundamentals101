package lab3;

public class activity2 {
    public static void main(String[] args) {
        double regularwages;
        double basepay=25;
        double regularhours=40;
        double overtimewages;
        double overtimepay=37.5;
        double overtimehours=10;
        double totalwages;
        regularwages=regularhours*basepay;
        overtimewages=overtimehours*overtimepay;
        totalwages=regularwages+overtimewages;
        System.out.println("Wages for this week are: $ "+totalwages);        
    }
}
