import java.util.Scanner;
public class usingwhile {
    public static void main(String[] args) {
        int num;
        Scanner S = new Scanner(System.in);
        num = S.nextInt();
        int sum=0,digit;
        while(num!=0){
            digit=num%10;
            num=num/10;
            sum=sum+digit;
        }
        System.out.println(sum);
        S.close();
    }
}
