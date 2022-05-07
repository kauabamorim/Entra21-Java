package lista03;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int fat = 1;
        
        System.out.print("escreva um numero: ");
        numero = scanner.nextInt();

        for(int i = numero; i >= 1; i--){
            fat *= i;
        }
        System.out.println("o fatorial de: " + numero + " é " + fat);
    }
}
