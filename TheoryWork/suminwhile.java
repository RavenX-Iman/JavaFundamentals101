import java.util.Scanner;
public class suminwhile {
    public static void main(String[] args) {
        char ch ='y';
        int num;
        int sum=0;
        Scanner S = new Scanner(System.in);
        while (ch=='y') {
            System.out.println("Enter a number: ");
            num=S.nextInt();
            sum=sum+num;
            System.out.println("Do you want more addition.Enter y/n");
            ch=S.next().charAt(0);
            
        }
        S.close();
        System.out.println(sum);
    }
}
