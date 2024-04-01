

public class Oneton {
    public static void main(String[] args) {
        
        int s =10;
        
         int k=1;
         Recursion(k,s);
    }

    private static void Recursion(int k, int s) {
            if(k>=s){
                return;
            }
            System.out.println(k);
            Recursion(k+1, s);
           
    }
    
}
