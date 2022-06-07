
package lista04;

import java.util.Scanner;

public class uniaoDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int auxiliar = 0;
        int c[] = new int[a.length + b.length];
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("GRUPO A");
            System.out.print("Informe o " + (i + 1) + "° numero: ");
            a[i] = scanner.nextInt();

        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("GRUPO B");
            System.out.print("Informe o " + (i + 1) + "° numero: ");
            b[i] = scanner.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            c[i + 10] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {

                if (c[i] < c[j]) {
                    auxiliar = c[i];
                    c[i] = c[j];
                    c[j] = auxiliar;
                }
            }
        }

        scanner.close();
        for(int i : c){
            System.out.println(i);
        }
    }
}
