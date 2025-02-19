import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        float p1,p2,p3,total,tax,netTotal;
        Scanner S1= new Scanner(System.in);
        //asking prices input
        //1
        System.out.println("Enter price 1 : ");
        p1=S1.nextFloat();
        //2
        System.out.println("Enter price 2 : ");
        p2=S1.nextFloat();
        //3
        System.out.println("Enter price 3 : ");
        p3=S1.nextFloat();
        //total sum
        total=p1+p2+p3;
        System.out.println("Total sum is:"+total);
        //average
        tax= (total*15)/100;
        System.out.println("Tax on total price is:"+tax);
        //net total
        netTotal= tax+total;
        System.out.println("The net total price is:"+ netTotal);
        S1.close();
    }
}

