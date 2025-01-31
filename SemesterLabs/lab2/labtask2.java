import java.util.*;
public class labtask2{
     static Scanner S2 = new Scanner(System.in);
    public static void main(String[] args) {
        int length,width,area,perimeter;
        System.out.println("Enter length:");
        length= S2.nextInt();
        System.out.println("Enter width:");
        width= S2.nextInt();
        area=length*width;
        perimeter=2*(length+width);
        System.out.println("Area is: "+ area);
        System.out.println("Perimeter is: "+ perimeter);
        S2.close();
    }
}
