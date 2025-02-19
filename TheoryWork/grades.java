import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        int marks;
        Scanner S = new Scanner(System.in);
        System.out.println("Tell the total marks:");
        marks= S.nextInt();
        if (marks>=85) {
            System.out.println("A");
        } else if (marks>=75) {
            System.out.println("B");
        }else if (marks>=65) {
            System.out.println("C");
        } else if (marks>=50) {
          System.out.println("D");
        }else{
            System.out.println("F");
        }
        S.close();
    }
}
