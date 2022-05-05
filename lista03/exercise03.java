package lista03;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int numeroFinal = 0;
        
        do{
            System.out.print("Escreva um numero: ");
            System.out.print("\nSair -----> 0");
            numero = scanner.nextInt();

            if(numero % 2 == 0 && numero != 0){
                numeroFinal *= numero;
            }
        }while(numero != 0);

        System.out.println("Produtorio dos numeros pares: " + numeroFinal);
    }
}
