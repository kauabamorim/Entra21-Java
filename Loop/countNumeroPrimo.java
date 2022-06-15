package Loop;

import java.util.Scanner;

public class countNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int numero;
        boolean isPrimo = true;

        System.err.print("Informe um numero: ");
        numero = scanner.nextInt();

        scanner.close();
        
        for (int j = 0; j < numero; numero--) {

            isPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo && numero != 1) {
                System.out.println("O numero " + numero + " é primo");

            } else {
                System.out.println("O numero " + numero + " não é primo");
            }
        }
    }
}
