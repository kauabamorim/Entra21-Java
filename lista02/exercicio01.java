import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int numero1, numero2, total;

        System.out.println("Digite um numero: ");
        numero1 = scanner.nextInt();

        System.out.println("outro Numero: ");
        numero2 = scanner.nextInt();

        total = numero1 % numero2;

        if(total > 0 ) 
        {
            System.out.println("nao sao multiplos");
        } else if(total == 0) 
        {
            System.out.println("é multiplo");
        }
        
    }

}