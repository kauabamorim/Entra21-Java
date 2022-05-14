package ExemplosAula;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		float valor = 0;
		int quantidadeValores = 0;

		byte item = 0;

		System.out.println("Seja Bem-Vindo ao Média+");
		System.out.println("As Opções Disponíveis São:");

		do {

			System.out.println("\n1 - Inserir Valor");
			System.out.println("2 - Informar Média");
			System.out.println("3 - Sair");

			System.out.print("\nInforme a Opção Desejada: ");
			item = leitor.nextByte();

			switch (item) {

			case 1:

				System.out.print("\nInforme Um Valor: ");
				valor += leitor.nextFloat();
				quantidadeValores++;

				break;

			case 2:

				System.out.print("\nA Média Atual é De: " + valor / quantidadeValores + "\n");

				break;

			case 3:

				System.out.println("\nSaindo do Sistema...");
				break;

			default:

				System.out.println("\nInforme Uma Opção Válida");
				break;
			}

		} while (item != 3);

		leitor.close();

	}
}