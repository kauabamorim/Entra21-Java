package lista03;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int fat = 1;
        int fat2 = 1;
                                    ///////////FALTA
        System.out.print("escreva um numero: ");
        numero1 = scanner.nextInt();

        System.out.print("escreva um numero: ");
        numero2 = scanner.nextInt();

        for (int i = numero1; i >= 1; i--) {
            fat *= i;
        }

        for (int i = numero2; i >= 1; i--) {
            fat2 *= i;
        }

        System.out.println("o fatorial de: " + numero1 + " é " + fat);
    }
}
