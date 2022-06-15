package lista03;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int menor = 0;
        int maior = 0 ;

        scanner.close();
        
        for(int i = 0; i < 10; i++){
            System.out.print("Escreva um numero: ");
            numero = scanner.nextInt();

            if(i == 0){
                maior = numero;
                menor = numero;

            }else if(numero> maior) {
                maior = numero;

            } else if(numero < menor){
                menor = numero;
            }
        }
        System.out.println("MAIOR: " + maior + " MENOR: " + menor);
    }
    
}
