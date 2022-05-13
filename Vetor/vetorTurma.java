package Vetor;

import java.util.Scanner;

public class vetorTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosSala, turmasSala;
        float notas;
        float somatoria = 0;

        System.out.print("Quantidade de turmas: ");
        turmasSala = scanner.nextInt();

        System.out.print("A quantos alunos na sala: ");
        alunosSala = scanner.nextInt();

        System.out.println("Quantidade de Notas: ");
        notas = scanner.nextFloat();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        float medias[][] = new float[turmasSala][alunosSala];

        for (int i = 0; i < medias.length; i++) {
            System.out.print("\nTurma: " + (i + 1));

            for (int j = 0; j < medias[i].length; j++) {
                System.out.print("\nAluno " + (j + 1));

                for (int k = 0; k < notas; k++) {
                    System.out.print("\nInforme a " + (k + 1) + "º nota: ");
                    somatoria += scanner.nextInt();

                    medias[i][j] = somatoria / notas;
                }
            }
        }

    }
}
