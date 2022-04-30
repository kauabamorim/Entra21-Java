import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int valor;
        int nota100, nota50, nota10, nota5, nota1;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Digite um valor:");
        valor = scanner.nextInt();

        nota100 = (valor / 100);
        nota50 = (valor % 100) / 50;
        nota10 = (valor % 100) % 50 / 10;
        nota5 = (valor % 100) % 50 % 10 / 5;
        nota1 = (valor % 100) % 50 % 10 % 5;

        System.out.println("Notas de 100: " + nota100 + " " + "Notas de 50: " + nota50 + " " + "Notas de 10: " + nota10 + " " + "Notas de 5: " + nota5 + " "+ "Notas de 1: " + nota1);
        
    }
}
