import java.util.Scanner;

public class matrizSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriz[][] = { { 1, 2, 3, 5, 7 }, { 4, 5, 6, 2, 3 }, { 7, 8, 9, 8, 9 }, { 9, 7, 5, 2, 1 } };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {

            soma += matriz[i][i];
        }
        System.out.println("\nA soma do diagonal principal foi de: " + soma);
    }
}
