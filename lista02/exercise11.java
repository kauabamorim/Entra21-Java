package lista02;
import java.util.Scanner;


public class exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        String cargo;

        float percentualGerente = 0.10f;
        float percentualEngenheiro = 0.20f;
        float percentualTecnico = 0.30f;
        int opc;
        float salario, soma, total;

        System.out.println("Digite o seu salario");
        salario = scanner.nextFloat();
        System.out.println("\nCódigo	Cargo 	    Percentual");
        System.out.println("101 	Gerente 	10%");
        System.out.println("102 	Engenheiro 	20%");
        System.out.println("103 	Técnico 	30%");
        System.out.println("0       Não esta na lista");
        opc = scanner.nextInt();

        switch(opc) {
            case 101:
                soma = salario * percentualGerente;
                total = soma + salario;

                System.out.println("Seu salario antigo " + salario);
                System.out.println("Novo salario: " + total + " R$");
                System.out.println("diferenca de: " + soma + " R$");
                break;
            case 102:
                soma = salario * percentualEngenheiro;
                total = soma + salario;

                System.out.println("Seu salario antigo " + salario);
                System.out.println("Novo salario: " + total + " R$");
                System.out.println("diferenca de: " + soma + " R$");
                break;
            case 103:
                soma = salario * percentualTecnico;
                total = soma + salario;

                System.out.println("Seu salario antigo " + salario);
                System.out.println("Novo salario: " + total + " R$");
                System.out.println("diferenca de: " + soma + " R$");
                break;
            default:
                soma = salario * 0.40f;
                total = soma + salario;

                System.out.println("Seu salario antigo " + salario);
                System.out.println("Novo salario: " + total + " R$");
                System.out.println("diferenca de: " + soma + " R$");
                break;
        }
    }
}
