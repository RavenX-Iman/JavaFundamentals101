package lab3;

public class task10 {
        public static void main(String[] args) { 
            // Display the header of the table
            //This line prints the headers of the table (Degrees, Radians, Sine, Cosine, Tangent) 
            //aligned in columns with a width of 10 characters each.
            //The %-10s ensures left alignment of string data
            System.out.printf("%-10s %-10s", "Degrees", "Radians");
            System.out.printf("%-10s %-10s %-10s%n","Sine","Cosine","Tangent");
            // First set of values (for 30 degrees)
            int degrees = 30; 
            double radians = Math.toRadians(degrees); 
            double sin = Math.sin(radians); 
            double cos = Math.cos(radians); 
            double tan = Math.tan(radians); 
            // Display the Data of the table for 30 degrees
            System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f%n", degrees, radians, sin, cos, tan);
            // Second set of values (for 60 degrees)
            degrees = 60; 
            radians = Math.toRadians(degrees); 
            sin = Math.sin(radians); 
            cos = Math.cos(radians); 
            tan = Math.tan(radians); 
            // Display the Data of the table for 60 degrees
            System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f%n", degrees, radians, sin, cos, tan);
        } 
}