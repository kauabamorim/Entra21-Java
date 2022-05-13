package lista04;

import java.util.Scanner;

public class paresVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosPares[] = new int[101];

        for (int i = 0; i <= 100; i += 2) {

            numerosPares[i] = i;

            System.out.println(numerosPares[i]);
        }
    }
}
