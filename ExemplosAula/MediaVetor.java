package ExemplosAula;


import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o tamanho da turma: ");
		float medias[] = new float[leitor.nextInt()];

		System.out.print("Informe a quantidade de notas: ");
		int quantidade = leitor.nextInt();

		float nota;

		for (int i = 0; i < medias.length; i++) {

			nota = 0;
			System.out.println("\nInforme as notas do " + (i + 1) + "° aluno: \n");

			for (int j = 0; j < quantidade; j++) {

				System.out.print("Informe a " + (j + 1) + "° nota: ");
				nota += leitor.nextFloat();
			}

			medias[i] = nota / (float) quantidade;
		}

		leitor.close();
		System.out.println();

		for (int i = 0; i < medias.length; i++) {

			System.out.println("A média do " + (i + 1) + "° aluno foi: " + medias[i]);
		}

		nota = 0;

		for (float media : medias) {

			nota += media;
		}

		System.out.println("\nA média da turma foi de: " + nota / (float) medias.length);

	}
}