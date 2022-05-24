package lista01;
import java.util.Scanner;

public class aumentoSalarial {
    public static void main(String[] args) {
        float salario, reajusteSalario, reajusteTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("=== SALARIO ===");
        System.out.print("Escreva o seu salario: ");
        salario = scanner.nextFloat();

        if (salario <= 1200) {
            reajusteSalario = (salario / 100) * 30;     /* Porcentagem, float variavel = 0.03f*/
            reajusteTotal = salario + reajusteSalario;

            System.out.println("=== REAJUSTE SALARIAL ===");
            System.out.println("Seu salario vai ser de: " + reajusteTotal);
        } else if (salario > 1200 && salario <= 2000) {
            reajusteSalario = (salario / 100) * 15;
            reajusteTotal = salario + reajusteSalario;
            System.out.println("=== REAJUSTE SALARIAL ===");
            System.out.println("Seu salario vai ser de: " + reajusteTotal);

        } else if (salario > 2000 && salario <= 3000) {
            reajusteSalario = (salario / 100) * 5;
            reajusteTotal = salario + reajusteSalario;
            System.out.println("=== REAJUSTE SALARIAL ===");
            System.out.println("Seu salario vai ser de: " + reajusteTotal);
        } else if(salario > 3000) 
        {
            System.out.println("Seu salario continua a ser: " + salario);
        }
        scanner.close();
    }
}
