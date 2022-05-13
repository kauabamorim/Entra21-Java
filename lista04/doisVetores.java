package lista04;

import java.util.Scanner;

public class doisVetores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int numerosIniciais[] = new int[10];
        int fatoriais[] = new int[10];
        int fatorial = 1;
        int quantidadeFatorial = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 0; i < numerosIniciais.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° numero: ");
            numerosIniciais[i] = scanner.nextInt();
        }

        for (int i = 0; i < numerosIniciais.length; i++) {
            fatorial = 1; 
            for (int j = numerosIniciais[i]; j > 0; j--) {
                fatorial *= j;
            }
            fatoriais[quantidadeFatorial] = fatorial;
            quantidadeFatorial++;
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
            
        for (int i : fatoriais)
            System.out.println(i);
    }
}