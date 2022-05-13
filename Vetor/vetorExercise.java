package Vetor;

import java.util.Scanner;

public class vetorExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosSala;
        int quantasNotas;
        float somatoria = 0;
        float mediaGeral = 0;

        System.out.print("A quantos alunos na sala: ");
        alunosSala = scanner.nextInt();

        System.out.print("Quantidade notas: ");
        quantasNotas = scanner.nextInt();

        int notas[] = new int[quantasNotas];
        float medias[] = new float[alunosSala];

        for (int i = 0; i < medias.length; i++) {

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Vamos calcular a media do " + (i + 1) + "° aluno");
            somatoria = 0;

            for (int j = 0; j < notas.length; j++) {
                System.out.print("\nInforme a " + (j + 1) + "° nota: ");
                somatoria += scanner.nextFloat();

                mediaGeral += somatoria;
            }

            medias[i] = somatoria / quantasNotas;
            mediaGeral = mediaGeral / 5;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.printf("Media Geral: " + "%.1f", mediaGeral);
    }
}
