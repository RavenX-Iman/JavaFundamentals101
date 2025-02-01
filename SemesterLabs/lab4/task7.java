package lab4;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner T7= new Scanner(System.in);
        int length_1,length_2,width_1,width_2,area_1,area_2;
        System.out.println("Enter length of rectangle 1:");
        length_1=T7.nextInt();
        System.out.println("Enter width of rectangle 1:");
        width_1=T7.nextInt();
        System.out.println("Enter length of rectangle 2:");
        length_2=T7.nextInt();
        System.out.println("Enter width of rectangle 2:");
        width_2=T7.nextInt();
        area_1=length_1*width_1;
        area_2=length_2*width_2;
        System.out.println("Area of rectangle 1 is:"+area_1);
        System.out.println("Area of rectangle 2 is:"+area_2);
        if (area_1>area_2) {
            System.out.println("Rectangle 2 with area "+area_2+"is smaller");
        } else if (area_1<area_2) {
            System.out.println("Rectangle 2 with area "+area_1+" is smaller");
        } else {
            System.out.println("Both rectangles have same area!");
        }
        T7.close();
    }
}
