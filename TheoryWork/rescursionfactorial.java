public class rescursionfactorial {
    public static int factorial(int x){
        if(x>0){
            return x*factorial(x-1);
        }
        else{
            return 1;
        }
    }
public static void main(String[] args) {
    int a= factorial(5);
    System.err.println(a);
}
}
    
