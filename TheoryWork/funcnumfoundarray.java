public class funcnumfoundarray {
    public static void Search(int []a,int x){
        int found=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                found =1;
                if (found==1) 
                    System.out.println("Element Found"); 
                else
                    System.out.println("Not found");
            }}
        }
        public static void main(String[] args){
        int b=5;
        int[]w={4,2,3,5,7};
        Search(w,b);
        
        }
}

