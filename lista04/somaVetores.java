package lista04;

import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somatoria = 0;
        int a[] = new int[20];

        for (int i = 0; i < a.length; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Informe o " + (i + 1) + "° numero: ");
            a[i] = scanner.nextInt();

            somatoria += a[i];
        }

        scanner.close();
        
        System.out.println("Soma Elementos:" + somatoria);
    }
}
