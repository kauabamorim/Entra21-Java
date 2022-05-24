package lista01;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) 
    {
        float salario, reajusteSalario, reajusteTotal, reajuste;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("=== SALARIO ===");
        System.out.print("Escreva o seu salario: ");
        salario = scanner.nextFloat();

        System.out.print("Digite o valor do Reajuste Salarial: ");
        reajuste = scanner.nextFloat();

        scanner.close();
        
        reajusteSalario = (salario * (reajuste / 100));

        reajusteTotal = reajusteSalario + salario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("=== REAJUSTE SALARIAL ===");
        System.out.println("Reajuste salarial é: " + reajusteSalario);
        System.out.println("Seu Salario vai ser de: " + reajusteTotal);

    }
}
