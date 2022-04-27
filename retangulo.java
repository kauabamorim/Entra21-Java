import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        float altura = 0;
        float base = 0;
        float dimensaoRetangulo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("===== CALCULAR A AREA DE UM RETANGULO ===== ");
        System.out.print("digite a altura: ");
        altura = scanner.nextFloat();

        System.out.print("digite a base: ");
        base = scanner.nextFloat();

        dimensaoRetangulo = altura * base;

        System.out.printf("As dimensões do retangulo é: " + "%.2f", dimensaoRetangulo);

    }
}
