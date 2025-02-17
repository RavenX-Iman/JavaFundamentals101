public class swap {
    public static void main(String[] args) {
        //swapping two numbers without using a 3rd variable
        int a=10;
        int b=20;
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
