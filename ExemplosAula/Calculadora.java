package ExemplosAula;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		byte opcao;
		int numero1;
		int numero2;
		int resultado;

		imprimir("Seja Bem-Vindo ao Calculadora++");

		do {

			imprimir("\nAs Opções Disponíveis São as Seguintes:\n");

			imprimir("1 - Soma");
			imprimir("2 - Subtração");
			imprimir("3 - Multiplicação");
			imprimir("4 - Divisão");
			imprimir("5 - Resto");
			imprimir("6 - Exponenciação");
			imprimir("7 - Fatorial");
			imprimir("8 - Sair\n");

			imprimirMesmaLinha("Informe a opção desejada: ");

			opcao = leitor.nextByte();

			switch (opcao) {

			case 1:

				imprimirMesmaLinha("\nInforme o Primeiro Número: ");
				numero1 = leitor.nextInt();

				imprimirMesmaLinha("Informe o Segundo Número: ");
				numero2 = leitor.nextInt();

				resultado = somar(numero1, numero2);
				imprimir("\nA Soma de " + numero1 + " e " + numero2 + " Foi de: " + resultado);

				break;

			case 2:

				imprimirMesmaLinha("\nInforme o Primeiro Número: ");
				numero1 = leitor.nextInt();

				imprimirMesmaLinha("Informe o Segundo Número: ");
				numero2 = leitor.nextInt();

				resultado = subtrair(numero1, numero2);
				imprimir("\nA Subtração de " + numero1 + " e " + numero2 + " Foi de: " + resultado);

				break;

			case 3:

				imprimirMesmaLinha("\nInforme o Primeiro Número: ");
				numero1 = leitor.nextInt();

				imprimirMesmaLinha("Informe o Segundo Número: ");
				numero2 = leitor.nextInt();

				resultado = multiplicar(numero1, numero2);
				imprimir("\nA Multiplicação de " + numero1 + " e " + numero2 + " Foi de: " + resultado);

				break;

			case 4:

				imprimirMesmaLinha("\nInforme o Primeiro Número: ");
				numero1 = leitor.nextInt();

				imprimirMesmaLinha("Informe o Segundo Número: ");
				numero2 = leitor.nextInt();

				resultado = dividir(numero1, numero2);
				imprimir("\nA Divisão de " + numero1 + " e " + numero2 + " Foi de: " + resultado);

				break;

			case 5:

				imprimirMesmaLinha("\nInforme o Primeiro Número: ");
				numero1 = leitor.nextInt();

				imprimirMesmaLinha("Informe o Segundo Número: ");
				numero2 = leitor.nextInt();

				resultado = resto(numero1, numero2);
				imprimir("\nO resto de " + numero1 + " e " + numero2 + " Foi de: " + resultado);

				break;

			case 6:

				imprimirMesmaLinha("\nInforme o Primeiro Número: ");
				numero1 = leitor.nextInt();

				imprimirMesmaLinha("Informe o Segundo Número: ");
				numero2 = leitor.nextInt();

				resultado = exponencial(numero1, numero2);
				imprimir("\nA Exponenciação de " + numero1 + " e " + numero2 + " Foi de: " + resultado);

				break;

			case 7:

				imprimirMesmaLinha("\nInforme o  Número: ");
				numero1 = leitor.nextInt();

				resultado = fatorial(numero1);
				imprimir("\nO Fatorial de " + numero1 + " Foi de: " + resultado);

				break;

			case 8:

				imprimir("Saindo do Sistema...");
				break;

			default:

				imprimir("Informe uma opção Válida!");
				break;
			}

		} while (opcao != 8);

		leitor.close();
		imprimir("Volte Sempre!");
	}

	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public static int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public static int dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}

	public static int resto(int numero1, int numero2) {
		return numero1 % numero2;
	}

	public static int exponencial(int numero1, int numero2) {

		int resultado = numero1;

		for (int i = 1; i < numero2; i++)
			resultado *= numero1;

		return resultado;
	}

	public static int fatorial(int numero) {

		int resultado = numero;

		for (int i = numero - 1; i > 1; i--)
			resultado *= i;

		return resultado;
	}

	public static void imprimir(String texto) {
		System.out.println(texto);
	}

	public static void imprimirMesmaLinha(String texto) {
		System.out.print(texto);
	}
}