package ExemplosAula;


import java.util.Scanner;

public class Media {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		float nota1 = leitor.nextFloat();

		System.out.print("Informe a segunda nota: ");
		float nota2 = leitor.nextFloat();

		System.out.print("Informe a terceira nota: ");
		float nota3 = leitor.nextFloat();

		leitor.close();

		float media = (nota1 + nota2 + nota3) / 3;

		System.out.println("A média do aluno foi:  " + media);
	}
}