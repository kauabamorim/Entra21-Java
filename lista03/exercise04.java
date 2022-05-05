package lista03;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        for(int i = 0; i < 5; i++){             // MUDAR PARA 10
            System.out.print("Escreva um numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("Media é: " + (numero / 5));
    }
    
}
