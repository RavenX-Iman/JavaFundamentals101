package lab4;
public class task1 {
    public static void main(String[] args) {
        int x,y,z;
        x=10;
        y=15;
        z=20;
        boolean a,b,c,d,e;
        a=!(x > 10);
        b=(x <= 5 || y < 15) ;
        c=(x != 5 ) && (y != z);
        d=(x >= z) || (x + y >= z);
        e=(x <= y - 2) && (y >= z) || (z - 2 != 20);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
