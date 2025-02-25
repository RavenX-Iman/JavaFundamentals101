
import java.util.Scanner;
public class activity5 {
    public static void main(String[] args) {
        final double pi= 3.14159; //final keyword is used to make a constant
        Scanner I =new Scanner(System.in);
        System.out.println("Enter a number for radius:");
        double radius=I.nextDouble();
        double area =radius*radius*pi; //area of circle formula
        System.out.println("The area of the circle of radius "+radius+" is: "+area);
        I.close();
    }
}
