import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int idade, meses, dias;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Qual a sua idade: ");
        idade = scanner.nextInt();
        System.out.print("Quantos meses: ");
        meses = scanner.nextInt();
        System.out.print("Quais dias: ");
        dias = scanner.nextInt();

        int resultadoIdadeEmDias = CalculoDias(idade, meses, dias);
        System.out.println("Sua idade em dias é de: " + resultadoIdadeEmDias + " dias");

        scanner.close();

    }
    public static int CalculoDias(int idade, int meses, int dias) {
        int calculoDias = idade * 365;
        int calculoMeses = (meses * 30);
        
        int emDias = calculoDias + calculoMeses + dias;

        return emDias;
    }
}
