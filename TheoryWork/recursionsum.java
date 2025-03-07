
public class recursionsum{
        public static int sumofseries(int x){
            if(x>0){
                return x+sumofseries(x-1);
            }
            else{
                return 0;
            }
        }
    public static void main(String[] args) {
        int a= sumofseries(5);
        System.err.println(a);
    }
}
