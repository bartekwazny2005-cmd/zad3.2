import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 5;

        kwadrat(n);          
        pelnyKwadrat(n);     

        pustyTrojkat(m);     
        pelnyTrojkat(m);    
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

    
    public static void pelnyKwadrat(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

   
    public static void pustyTrojkat(int m) {

        System.out.println("*");  k

        for (int i = 1; i < m - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < i - 1; j++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < m; i++)
            System.out.print("*");
        System.out.println("\n");
    }

   
    public static void pelnyTrojkat(int m) {

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }
}
