package lab3;

public class activity3 {
    public static void main(String[] args) {
        double monthlypay=6000.0;
        double cont1,cont2,cont3;

        //calculate and display a 5% contribution
        cont1=(monthlypay*5)/100;
        System.out.println("5% is: $"+cont1+" per month");

        //calculate and display a 8% contribution
        cont2=(monthlypay*8)/100;
        System.out.println("8% is: $"+cont2+" per month");

        //calculate and display a 10% contribution
        cont3=(monthlypay*10)/100;
        System.out.println("10% is: $"+cont3+" per month");
    }
}
