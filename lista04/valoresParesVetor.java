package lista04;

import java.util.Scanner;

public class valoresParesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int  [15];
        int pares = 0;

        for(int i = 0; i < 15; i++){
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Informe o: " + (i + 1) + "º numero: ");
            a[i] = scanner.nextInt();

            pares = (a[i] % 2);

            if(pares >= 0){
                a[i]++;
            }
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int i : a){
            System.out.println(i);
        }
    }
}
