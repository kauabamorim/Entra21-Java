package lista04;

import java.util.Scanner;

public class vetorNPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean isPrimo = true;
        int quantidadePrimos = 0;
        int numero = 2;
        int numeroPrimo[] = new int[10];

        while(quantidadePrimos != 10){

            isPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i  == 0 && numero != 1) {
                    isPrimo = false;
                    break;
                }
            }
            if(isPrimo){
                numeroPrimo[quantidadePrimos] = numero;
                quantidadePrimos++;
            }
            numero++;
        }

        scanner.close();
        
        for(int i : numeroPrimo) {
            System.out.println(i);
        }
    }
}