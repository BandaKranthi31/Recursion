import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = Recursion(n);
        System.out.println(s);
    }

    private static int Recursion(int n) {
       if(n==2)
         return n;
        return Recursion(n-1)*n;
    }
}
