public class CommonJavaExceptions {
    public static void main(String[] args) {
        try {
            // ArithmeticException: Division by zero
            int result = 10 / 0; 
        } catch (ArithmeticException e) { 
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // NullPointerException: Accessing a method on a null object
            String str = null;
            str.length(); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException: Accessing invalid index
            int[] arr = {1, 2, 3};
            int value = arr[5]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // NumberFormatException: Invalid conversion from String to number
            int num = Integer.parseInt("abc"); 
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        try {
            // ClassCastException: Invalid type casting
            Object obj = new Integer(10);
            String str = (String) obj; 
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        try {
            // IllegalArgumentException: Passing invalid argument to a method
            Thread t = new Thread();
            t.setPriority(20); // Priority must be between 1 and 10
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            // IndexOutOfBoundsException: Invalid index in collections
            String str = "Hello";
            char ch = str.charAt(10); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // FileNotFoundException: Accessing a non-existent file
            java.io.FileReader reader = new java.io.FileReader("non_existent_file.txt"); 
        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }

        try {
            // IOException: General I/O error
            java.io.FileReader reader = new java.io.FileReader("file.txt");
            reader.close();
            reader.read(); 
        } catch (java.io.IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        try {
            // InterruptedException: Thread interrupted while sleeping
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        }
    }
}
    
