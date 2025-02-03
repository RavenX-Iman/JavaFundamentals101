package lab5;
public class Activity7 {
    public static void main(String[] args) {
        System.out.println("           Multiplication Table");
         // Display the column headers (numbers 1 to 9)
         System.out.print("    ");
         for (int j = 1; j <= 9; j++) {
             System.out.print("   " + j);  
             // Align headers properly with 3 spaces
         }
         
         // Print a separator line
         System.out.println("\n____________________________________________________");
         
         // Generate and display the multiplication table using nested loops
         for (int i = 1; i <= 9; i++) {
             // Print row header (the number being multiplied)
             System.out.print(i + " | ");
             
             // Inner loop for calculating and printing the products
             for (int j = 1; j <= 9; j++) {
                 System.out.printf("%4d", i * j);  // Print the product with 4 spaces for alignment
             }
             
             // Move to the next line after printing each row
             System.out.println();
         }
     }
 }
  
