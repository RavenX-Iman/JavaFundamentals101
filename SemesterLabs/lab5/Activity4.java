package lab5;
import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        Scanner A4 = new Scanner(System.in);
        int num,guess;
        boolean done;
        num = (int) (Math.random() * 100);
        done = false;
        while (!done) {
            System.out.print("Enter an integer greater than or equal to 0 and less than 100: ");
            guess = A4.nextInt();
            System.out.println();
            if (guess == num) {
                System.out.println("You guessed the correct number.");
                done = true;
            }else if (guess < num) {
                System.out.println("Your guess is lower than the number.\nGuess again!");
            }else {
                System.out.println("Your guess is higher than the number.\nGuess again!");
            }
        } //end while
        A4.close();
    }
    
}
