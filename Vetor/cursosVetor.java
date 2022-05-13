package Vetor;

import java.util.Scanner;

public class cursosVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeCursos, quantidadeNotas, quantidadeAlunos, quantidadeDeTurmas;
        float somatoria = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Informe a quantidade de cursos: ");
        quantidadeCursos = scanner.nextInt();

        System.out.print("Informe a quantidade de Turmas: ");
        quantidadeDeTurmas = scanner.nextInt();

        System.out.print("Informe a quantidade de Alunos: ");
        quantidadeAlunos = scanner.nextInt();

        System.out.print("Informe a quantidade de Notas: ");
        quantidadeNotas = scanner.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        float medias[][][] = new float[quantidadeCursos][quantidadeAlunos][quantidadeDeTurmas];

        for (int i = 0; i < medias.length; i++) {

            for (int j = 0; j < medias[i].length; j++) {
                System.out.print("Turma: " + (i + 1) + " ");

                for (int k = 0; k < quantidadeNotas; k++) {
                    System.out.print("Aluno: " + (j + 1) + " ");
                    for (int h = 0; h < quantidadeNotas; h++) {
                        System.out.print("Informe a " + (h + 1) + "° nota: ");
                        somatoria += scanner.nextFloat();

                        medias[i][j][k] = somatoria / quantidadeNotas;
                    }
                    System.out.println("media do : " + medias[i][j][k]);
                    somatoria = 0;
                }
            }
        }
    }
}
