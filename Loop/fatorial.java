package Loop;
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fat = 1;
        int numero;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        scanner.close();
        for(int i = numero; i >= 1; i--) {
            fat *= i;
        }
        System.out.println("o fatorial é: " + fat);
    }
}
