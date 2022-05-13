package Loop.DoWhile;

import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pessoaA, pessoaB;
        float alturaAnoA, alturaAnoB;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Informe a sua Altura Xico: ");
        pessoaA = scanner.nextFloat();

        System.out.print("Voce cresce quantos Cm por ano Xico: ");
        alturaAnoA = scanner.nextFloat();

        System.out.print("Informe a sua Altura Zé: ");
        pessoaB = scanner.nextFloat();

        System.out.print("Voce Cresce quantos Cm por ano Zé: ");
        alturaAnoB = scanner.nextFloat();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int tempo = 0;

        do{
            pessoaA += alturaAnoA;
            pessoaB += alturaAnoB;
    
            tempo++;
        }while(pessoaA <= pessoaB);

        System.out.println("Xico demorou " + tempo + " anos" + 
                " para passar a Altura de Zé");
    }
}
