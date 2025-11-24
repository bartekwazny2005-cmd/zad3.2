import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 5;
        kwadrat(n); 
        trojkat(m);

    }

    
    public static void kwadrat(int n) {
        
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

       
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

       
        if (n > 1) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
          System.out.print(" ");
          for (int C = 0; C < 4; C++)
            System.out.println();
        }
    }
//////////////////////////////////////////////////////////////////////////////////////
 
    public static void trojkat(int m) {
      
        for (int i = 1; i < m; i++)
            System.out.print("*");
        System.out.println();
        for (int i = 1; i < m + 1; i++)
            System.out.print("*");
        System.out.println();
        for (int i = 0; i < m + 2; i++)
            System.out.print("*");
        System.out.println();
      
      
    }
}
