package lista03;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int fator = 1;
        float valorE = 1;

        System.out.println("Informe um Numero: ");
        numero = scanner.nextInt();

        scanner.close();

        for(int i = 1; i <= numero; i++){
            fator = 1;

            for(int j = i; j >0; j--){
                fator *= i;
            }
            valorE += 1 / fator;
        }
        System.out.println(valorE);

    }
}
