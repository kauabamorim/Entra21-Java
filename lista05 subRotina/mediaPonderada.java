import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3;

        System.out.print("Informe a nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Informe a nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("Informe a nota: ");
        nota3 = scanner.nextFloat();

        float resultado = MediaPonderada(nota1, nota2, nota3);
        System.out.println("A sua media é: " + resultado);

        scanner.close();

    }
    public static float MediaPonderada(float nota1, float nota2, float nota3) {
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        float somatoria = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        float resultado = somatoria / 10;

        return resultado;
    }
}
