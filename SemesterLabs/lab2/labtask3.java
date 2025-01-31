import java.util.*;
public class labtask3{
     static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int SECRET=11;
        double RATE=12.50;
        int num1,num2,newNum;
        String name;
        double hoursWorked,wages;
        System.out.println("Enter num1:");
        num1= console.nextInt();
        System.out.println("Enter num2:");
        num2= console.nextInt();
        System.out.println("The value of num1 is = "+num1);
        System.out.println("The value of num2 is = "+num2);
        newNum=(num1*2)+num2;
        System.out.println("The value of newNum is = "+newNum);
        newNum=newNum+SECRET;
        System.out.println("The value of newNum and secret is = "+newNum);
        System.out.println("Enter last name:");
        name= console.next();
        System.out.println("Enter a decimal number between 0-70.");
        hoursWorked= console.nextDouble();
        wages=RATE*hoursWorked;
        System.out.println("Name: "+name);
        System.out.println("Payrate: "+RATE);
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.println("Salary: "+wages);
        console.close();
    }
}
