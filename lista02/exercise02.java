package lista02;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new Scanner(System.in);

        int n1, n2,n3;

        System.out.println("n1: ");
        n1 = scanner.nextInt();

        System.out.println("n2: ");
        n2 = scanner.nextInt();

        System.out.println("n3:");
        n3 = scanner.nextInt();

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        scanner.close();
        
        if(n1 > n2 && n1 >n3) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("numero 1 é o maior");
        } else if (n2 > n1 && n2 > n3) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("o numero 2 é o maior");
        } else if (n3 > n1 && n3 > n2) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("o numero 3 é o maior");
        }
    }
}