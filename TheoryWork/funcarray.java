public class funcarray {
    public static int summ (int []a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum =sum+a[i];
        }
        return sum;
    }
     {
        int[]x={5,20,4,9,23,13};        
        int[]y={15,2,14,29,4,13}; 
        int a = summ(x);       
        int b = summ(y);  
        System.out.println(a+"  "+b);     

    }
}
