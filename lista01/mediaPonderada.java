package lista01;
import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) 
    {
        float nota1, nota2, nota3;
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;
        float somaNotaEPeso1, somaNotaEPeso2, somaNotaEPeso3;
        float mediaFinal = 0;
        float somaTotal = 0;
        int somatoriaPesos = peso1 + peso2 + peso3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("==== CALCULADOR DE MEDIA PONDERADA ====");
        System.out.print("Nota 1: ");
        nota1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        nota2 = scanner.nextFloat();

        System.out.print("Nota 3: ");
        nota3 = scanner.nextFloat();

        somaNotaEPeso1 = nota1 * peso1;
        somaNotaEPeso2 = nota2 * peso2;
        somaNotaEPeso3 = nota3 * peso3;

        mediaFinal = somaNotaEPeso1 + somaNotaEPeso2 + somaNotaEPeso3;

        /* Media ponderada */
        somaTotal = mediaFinal / somatoriaPesos;   

        System.out.printf("Sua media Ponderada é: " + "%.1f", somaTotal); 


    }
}
