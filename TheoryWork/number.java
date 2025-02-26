import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int num;
        Scanner S = new Scanner(System.in);
        System.out.println("Give a number:");
        num= S.nextInt();
        if (num>0) {
            System.out.println("It is positive");
        } else {
            System.out.println("It is negative");
        }
        S.close();
    }
    
}
