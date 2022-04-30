import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float a, b, c; 

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println("Escreva o A: ");
        a = scanner.nextFloat();

        System.out.println("Escreva o B: ");
        b = scanner.nextFloat();

        System.out.println("Escreva o C: ");
        c = scanner.nextFloat();

        if(a > b + c) 
        {
            System.out.println("Não formam um triangulo");

        } else 
        {
            System.out.println("Formam um triangulo");
        }
    }
}
