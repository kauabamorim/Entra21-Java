package lista02;
import java.util.Scanner;

public class exercise10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int saldo;
        float soma, total;
        float creditoA = 0.20f;
        float creditoB = 0.30f;
        float creditoC = 0.40f;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextInt();

        if(saldo <= 200) {

            System.out.println("Nenhum credito");
        } else if(saldo >= 201 && saldo <= 400) {
            soma = saldo * creditoA;
            total = saldo + soma;

            System.out.println("Valor de credito: " + soma);
            System.out.println("Seu saldo vai ser de: " + total);
        } else if(saldo >= 401 && saldo <= 600) {
            soma = saldo * creditoB;
            total = saldo + soma;

            System.out.println("Valor de credito: " + soma);
            System.out.println("Seu saldo vai ser de: " + total);
        } else if(saldo >= 601) {

            soma = saldo * creditoC;
            total = saldo + soma;

            System.out.println("Valor de credito: " + soma);
            System.out.println("Seu saldo vai ser de: " + total);

        }

    }
    
}
