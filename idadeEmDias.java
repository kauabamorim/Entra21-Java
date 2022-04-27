import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) 
    {

        int dia, mes, ano, somaDias;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("==== IDADE EM DIAS ====");
        System.out.print("Quantos anos voce tem? ");
        ano = scanner.nextInt();

        System.out.print("Digite o mes: ");
        mes = scanner.nextInt();
        
        System.out.print("Digite o seu dia de nascimento: ");
        dia = scanner.nextInt();



        somaDias = (ano * 365) + (mes * 30) + dia;

        System.out.println("Sua idade em dias é: " + somaDias);

    }
}
