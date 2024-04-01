import java.util.Scanner;

/**
 * IsSorted
 */
public class IsSorted {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt(); //no of elements in a array
            int arr[] = new int[s];
            int j=0;
            for(int i=0;i<s;i++){
                arr[i] = sc.nextInt();
                
            }
            System.out.println(Recursion(arr, j));
             
        }

    }

    public static boolean Recursion(int arr[],int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
           return Recursion(arr, i+1);
        
    }
}