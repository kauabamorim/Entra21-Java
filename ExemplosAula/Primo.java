package ExemplosAula;


import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o limite: ");

		int limite = leitor.nextInt();
		leitor.close();

		for (int i = 2; i <= limite; i++) {

			String mensagem = "O número " + i + " é primo";

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					mensagem = "O número " + i + " não é primo";
					break;
				}
			}

			System.out.println(mensagem);

		}
	}
}