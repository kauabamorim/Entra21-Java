import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        int base, altura;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Informe a base: ");
        base = scanner.nextInt();

        System.out.print("Informe a altura: ");
        altura = scanner.nextInt();

        int retangulo = DimensoesRetangulo(base, altura);
        System.out.println("A area do retangulo é: " + retangulo);

        scanner.close();
    }
    public static int DimensoesRetangulo(int base, int altura) {

        int retangulo = base * altura;

        return retangulo;
    }
}
