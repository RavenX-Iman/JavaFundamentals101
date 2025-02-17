import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        float temperature;
        
        System.out.println("Would you like to convert from:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter 1 or 2: ");
        int choice = S.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = S.nextFloat();
            float celsius = ((temperature - 32) / 9) * 5;
            System.out.println("The temperature in Celsius is: " + celsius);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = S.nextFloat();
            float fahrenheit = ((temperature * 9) / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        } else {
            System.out.println("Invalid choice. Please run the program again and enter 1 or 2.");
        }

        S.close();
    }
}
