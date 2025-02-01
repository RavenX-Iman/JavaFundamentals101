package lab3;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int c1,c2,c3;
        Scanner S3=new Scanner(System.in);
        // asking user for number of students in each class:
        System.out.println("Enter number of students in c1:");
        c1=S3.nextInt();

        System.out.println("Enter number of students in c2:");
        c2=S3.nextInt();

        System.out.println("Enter number of students in c3:");
        c3=S3.nextInt();

        int desksc1 = (c1 + 1) / 2; 
        int desksc2 = (c2 + 1) / 2;
        int desksc3 = (c3 + 1) / 2;
        
        System.out.println("Total desks in c1 should be: "+ desksc1);
        System.out.println("Total desks in c2 should be: "+ desksc2);
        System.out.println("Total desks in c3 should be: "+ desksc3);
        int totaldesks= desksc1+ desksc2+ desksc3;
        System.out.println("The total number desks that should be purchased is: "+totaldesks);
        S3.close();
    }
}