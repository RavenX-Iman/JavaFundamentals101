package lab5;
import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
        Scanner A2 = new Scanner(System.in);
        int limit,integers,sum,counter;
        System.out.println("Enter the number of " + "integers in the list:");
        limit=A2.nextInt();
        sum=0;
        counter=0;
        System.out.println("Enter " + limit+ " integers.");
        //While Loop to Collect Input and Calculate the Sum:
        while (counter<limit) {
            integers = A2.nextInt(); 
            sum = sum + integers;
            counter++; 
        }
        System.out.printf("The sum of the %d "+"integers= %d%n",limit, sum); 
        if (counter != 0){
            System.out.printf("The average = %d%n",(sum/counter)); 
        }else{
            System.out.println("No input.");
        }
        A2.close();

    }    
}
