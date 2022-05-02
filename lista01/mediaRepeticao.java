package lista01;
import java.util.Scanner;

public class mediaRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notas;
        float nota = 0;
        
        System.out.print("Escreva quantas notas voce tem: ");
        notas = scanner.nextInt();

        for(int i = 0; i < notas; i++) {
            System.out.print("Informe a " + (i + 1) + "° nota: ");
            nota += scanner.nextFloat();
        }
        System.out.printf("Sua media é: " + "%.1f", (nota / notas));
    }
}
