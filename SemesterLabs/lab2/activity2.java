import java.util.Scanner;
public class activity2 {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int feet,inches;
        System.out.println("Enter 2 integers separated by spaces:");
        feet=S.nextInt();
        inches=S.nextInt();
        System.out.println("feet: "+ feet);
        System.out.println("inches: "+ inches);
        S.close();
    }
}
