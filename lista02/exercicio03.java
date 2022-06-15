package lista02;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroParOuImpar, sobraNumeroParImpar;

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println("Digite um numero: ");
        numeroParOuImpar = scanner.nextInt();
        
        scanner.close();

        sobraNumeroParImpar = (numeroParOuImpar % 2);


        if(sobraNumeroParImpar == 0)
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("Esse numero é par");
        } else if (sobraNumeroParImpar >= 1) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("Esse numero é impar");
        }
    }
}
