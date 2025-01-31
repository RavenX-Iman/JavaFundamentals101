
import java.util.Scanner;
public class activity3 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        String firstname,lastname;
        int age;
        double weight;
        System.out.println("Enter firstname , lastname ,"+ "age and weight "+ "separated by spaces");
        firstname=S1.next();
        lastname=S1.next();
        age= S1.nextInt();
        weight= S1.nextDouble();
        System.out.println("Name: "+firstname+lastname);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);
        S1.close();  
    }
}
   