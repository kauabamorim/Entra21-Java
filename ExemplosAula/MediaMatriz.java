package ExemplosAula;


import java.util.Scanner;

public class MediaMatriz {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Seja Bem-Vindo ao Tumas++\n");

		System.out.print("Informe a Quantidade de Turmas: ");
		int quantidadeTurmas = leitor.nextInt();

		System.out.print("Informe o Tamanho das Turmas: ");
		int quantidadeAlunos = leitor.nextInt();

		System.out.print("Informe a Quantidade de Notas: ");
		int quantidadeNotas = leitor.nextInt();

		float notas[][][] = new float[quantidadeTurmas][quantidadeAlunos][quantidadeNotas];

		for (int i = 0; i < notas.length; i++) {

			System.out.println("\nInforme as Notas da " + (i + 1) + "° Turma:");

			for (int j = 0; j < notas[i].length; j++) {

				System.out.println("\nInforme as Notas do " + (j + 1) + "° Aluno da " + (i + 1) + "° Turma:\n");

				for (int k = 0; k < notas[i][j].length; k++) {

					System.out.print("Informe a  " + (k + 1) + "° Nota do " + (j + 1) + "° Aluno da " + (i + 1) + "° Turma: ");
					notas[i][j][k] = leitor.nextFloat();
				}
			}
		}

		leitor.close();
		System.out.println();

		float somatorioNotas = 0;
		float somatorioMedias = 0;
		float somatorioTurmas = 0;

		float media = 0;

		for (int i = 0; i < notas.length; i++) {

			somatorioMedias = 0;

			for (int j = 0; j < notas[i].length; j++) {

				somatorioNotas = 0;
				media = 0;

				for (int k = 0; k < notas[i][j].length; k++) {

					somatorioNotas += notas[i][j][k];
				}

				media = somatorioNotas / notas[i][j].length;
				somatorioMedias += media;

				System.out.println("A Média do " + (j + 1) + "° Aluno da " + (i + 1) + "° Turma foi: " + media);
			}

			media = somatorioMedias / notas[i].length;
			somatorioTurmas += media;

			System.out.println("\nA Média da " + (i + 1) + "° Turma foi: " + media + "\n");
		}

		media = somatorioTurmas / notas.length;
		System.out.println("A Média das Turmas foi: " + media);
	}
}