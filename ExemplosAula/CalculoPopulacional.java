package ExemplosAula;


import java.util.Scanner;

public class CalculoPopulacional {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a população do país A: ");
		float habitantesA = leitor.nextFloat();

		System.out.print("Informe a taxa de crescimento da população do país A: ");
		float taxaA = leitor.nextFloat();

		System.out.print("Informe a população do país B: ");
		float habitantesB = leitor.nextFloat();

		System.out.print("Informe a taxa de crescimento da população do país B: ");
		float taxaB = leitor.nextFloat();

		leitor.close();

		int tempo = 0;

		while (habitantesA <= habitantesB) {

			habitantesA += habitantesA * taxaA;
			habitantesB += habitantesB * taxaB;

			tempo++;
		}

		System.out.println("O tempo para a população A ultrapassar a B foi de: " + tempo + " anos");

	}
}