import java.util.Scanner;

/**
 * Fibonacii
 */
public class Sumation {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int s = Recursion(n);
            System.out.println(s);
        }
    }

    private static int Recursion(int n) {
        if(n==1){
            return n;
        }
        return Recursion(n-1)+n;
    }
}