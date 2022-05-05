package lista03;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroParOuImpar, sobraNumeroParImpar;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int j = 100; j < 200; j++) {

            for (int i = 0; i < j; i++) {
                sobraNumeroParImpar = (i % 2);

                if (sobraNumeroParImpar >= 1) {
                    System.out.println("O Numero " + (i) + " é impar");
                }
            }
        }
    }
}