import java.util.Scanner;

public class exercise06 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println("Valor de um Lado");
        a = scanner.nextInt();

        System.out.println("Valor lado");
        b = scanner.nextInt();

        System.out.println("Valor lado");
        c = scanner.nextInt();

        if(a == b && a == c) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            System.out.println("Triangulo Equilátero");
        } else if (a == b && a != c) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            System.out.println("Triângulo Isósceles");
        } else if(a != b && a == c) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            System.out.println("Triângulo Isósceles");
        }
        else if(a != b && a != c) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            System.out.println("Triângulo Escaleno");
        }else 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            System.out.println("Triângulo Isósceles");
        }
    }
}
