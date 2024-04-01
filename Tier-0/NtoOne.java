import java.util.Scanner;

public class NtoOne {
    public static void main(String[] args) {
        @SuppressWarnings("resource")  //sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thhe Limit");
        int s = sc.nextInt();
         Recursion(s);
       
    }

    private static void Recursion(int s) {
      if(s<=0){
        return;
      }
      System.out.println(s);
      Recursion(s-1);
    }
}
