package lista04;

import java.util.Scanner;

public class intersecaoVetores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[A.length + B.length];

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 0; i < A.length; i++) {
            System.out.println("Grupo A");
            System.out.print("Informe o: " + (i + 1) + "º numero: ");
            A[i] = scanner.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

        }
        for (int i = 1; i < B.length; i++) {
            System.out.println("Grupo B");
            System.out.print("Informe o: " + (i + 1) + "º numero: ");
            B[i] = scanner.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] == B[i]) {

                C[i] = A[i];
                C[i + 10] = B[i];
            }
        }

        for (int i : C)
            System.out.println(i);
    }
}