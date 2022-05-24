package lista01;
import java.util.Scanner;

public class temperaturaConvert {
    public static void main (String[] args) 
    {
        float fahrenheit, celsius;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("=== TEMPERATURA ===");
        System.out.print("esta quantos Fahrenheit? ");
        fahrenheit = scanner.nextFloat();

        scanner.close();

        celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("Sua conversao é: " + "%.2f", celsius);

    }
}
