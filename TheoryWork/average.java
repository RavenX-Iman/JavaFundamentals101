import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        int one,two,three,four,five;
        double sum,average;

        Scanner S1= new Scanner(System.in);
        //asking marks input

        //1
        System.out.println("Enter subject 1 marks: ");
        one=S1.nextInt();
        //2
        System.out.println("Enter subject 2 marks: ");
        two=S1.nextInt();
        //3
        System.out.println("Enter subject 3 marks: ");
        three=S1.nextInt();
        //4
        System.out.println("Enter subject 4 marks: ");
        four=S1.nextInt();
        //5
        System.out.println("Enter subject 5 marks: ");
        five=S1.nextInt();

        //calculations
        //sum
        sum=one+two+three+four+five;
        System.out.println("Total sum is:"+sum);
        
        //average
        average= sum/5.0;
        System.out.println("Average is: "+average);
        S1.close();
    }
}
