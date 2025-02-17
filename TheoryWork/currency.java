public class currency {
    public static void main(String[] args) {
        int currency=29875;
        System.out.println("The currency is: "+currency);
        
    System.out.println("5000pkr notes:"+currency/5000);
    currency=currency% 5000; 

    System.out.println("1000pkr notes:"+currency/1000);
    currency=currency% 1000; 

    System.out.println("500pkr notes:"+currency/500);
    currency=currency% 500; 

    System.out.println("100pkr notes:"+currency/100);
    currency=currency% 100; 

    System.out.println("50pkr notes:"+currency/50);
    currency=currency% 50;   

    System.out.println("10pkr notes:"+currency/10);
    currency=currency% 10;
    
    System.out.println("5pkr coin:"+currency/5);
    currency=currency% 5;  

    System.out.println("1pkr coin:"+currency/1);
    currency=currency%1;  
     

    
    // int five =currency/5000;
    // currency=currency% 5000;
    // System.out.println("5000 notes:"+five);
    // int thousand =currency/1000 ;
    // currency=currency% 1000;
    // System.out.println("1000 notes:"+thousand);
    // int fiveH =currency/500 ;
    // currency=currency% 500;
    // System.out.println("500 notes:"+fiveH);
    // int hundred =currency/100 ;
    // currency=currency% 100;
    // System.out.println("100 notes:"+hundred);
    // int fifty =currency/50 ;
    // currency=currency% 50;
    // System.out.println("50 notes:"+fifty);
    // int ten =currency/10 ;
    // currency=currency% 10;
    // System.out.println("10 notes:"+ten);

    }
    

}
