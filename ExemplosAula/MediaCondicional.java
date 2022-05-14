package ExemplosAula;


import java.util.Scanner;

public class MediaCondicional {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		float nota1 = leitor.nextFloat();

		System.out.print("Informe a segunda nota: ");
		float nota2 = leitor.nextFloat();

		System.out.print("Informe a terceira nota: ");
		float nota3 = leitor.nextFloat();

		System.out.print("Informe a  frequência: ");
		int frequencia = leitor.nextInt();

		leitor.close();

		float media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {

			if (frequencia >= 75) {

				System.out.println("Aprovado");

			}

			else {

				System.out.println("Reprovado por Frequência");

			}
		}

		else {

			System.out.println("Reprovado por Nota");

		}
	}
}