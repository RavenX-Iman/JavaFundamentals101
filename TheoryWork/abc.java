public class abc {
    //program to compare two numbers
    // public static void main(String[] args) {
    //     int a = 10;
    //     int b=20;
    //     if (a<b) {
    //         System.out.println("a is smaller");
    //     }else{
    //         System.out.println("b is smaller");
    //     }
        
    // }

        //program to print numbers from 20 to 100
        // public static void main (String args []){
        //     for ( int a=20; a<=100; a+=2)
        //     {
        //         System.out.println(a);
        //     }
        // }

        //program to print numbers from 100 to 20 in decreasing order
        // public static void main (String args []){
        //     for ( int a=100; a>=20; a-=2)
        //     {
        //         System.out.println(a);
        //     }
        // }

        // program to print odd numbers from 100 to 20
        public static void main (String args []){
            for ( int a=100; a>20; a--)
            {
              if ( a%2==0)
              continue;
                System.out.println(a);
            }
        }
        
}
