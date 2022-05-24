package lista01;
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fat, numero;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        scanner.close();

        for(fat = 1; numero > 1; numero = numero - 1) {
            fat = fat * numero;
        }
        System.out.println("o fatorial é: " + fat);
    }
}
