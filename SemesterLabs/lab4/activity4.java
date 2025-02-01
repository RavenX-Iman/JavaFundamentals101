package lab4;
import java.util.Scanner;
public class activity4 {
    public static void main(String[] args) {
         Scanner A4 = new Scanner(System.in);
    int score;
    System.out.println("Enter total score:");
    score=A4.nextInt();
    if (score>=90) {
        System.out.println("A Grade");
        
    }else if(score>=80) {
        System.out.println("B Grade");
        
    }else if(score>=70) {
        System.out.println("C Grade");
        
    }else if(score>=60) {
        System.out.println("D Grade");
        
    }else{
        System.out.println("F Grade");
    }
    A4.close();
}
}