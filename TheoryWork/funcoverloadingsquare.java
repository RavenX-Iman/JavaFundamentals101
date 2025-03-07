public class funcoverloadingsquare {
    public static void square(int a){
        int x= a*a;
        System.out.println(x);
    }
    public static void square(float a){
        float x=a*a;
        System.out.println(x);
    }
    public static void square( double a){
        double x= a*a;
        System.out.println(x);
    }    
    public static void main(String[] args) {
          int b=5;
           float e=4.6f;
           double w= 3.1456795;
           square(w);
           square(b);
           square(e);

    }
}
