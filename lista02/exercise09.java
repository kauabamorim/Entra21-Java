package lista02;
import java.util.Scanner;


public class exercise09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        float cachorroQuente = 1.20f;
        float bauruSimples = 1.30f;
        float bauruComOvo = 1.50f;
        float hamburguer = 1.20f;
        float mistoQuente = 1.30f;
        float refrigerante = 1.00f;
        int opc = 0;
        float valor;
        int quantidade;

            System.out.print("\033[H\033[2J");
            System.out.flush();

        do {
        System.out.println("========= TABELA ================");
        System.out.println("Produto		    Código      Preço");
        System.out.println("Cachorro-quente	    100 	1,20");
        System.out.println("Bauru simples 	    101 	1,30");
        System.out.println("Bauru com ovo 	    102 	1,50");
        System.out.println("Hambúrguer          103 	1,20");
        System.out.println("Misto Quente 	    104 	1,30");
        System.out.println("Refrigerante 	    105 	1,00");
        System.out.println("SAIR                0");
        opc = scanner.nextInt();

        System.out.println("Digite a quantidade que desejas: ");
        quantidade = scanner.nextInt();
        switch(opc) {
            
            case 100:
                valor = cachorroQuente * quantidade;
                System.out.println("Valor a pagar: " + valor);
                break;
            case 101:
            valor = bauruSimples * quantidade;
            System.out.println("Valor a pagar: " + valor);

                break;
            case 102:
                valor = bauruComOvo * quantidade;
                System.out.println("Valor a pagar: " + valor);

                break;
            case 103:
                valor = hamburguer * quantidade;
                System.out.println("Valor a pagar: " + valor);

                break;
            case 104:
            valor = mistoQuente * quantidade;
            System.out.println("Valor a pagar: " + valor);

                break;
            case 105:
            valor = refrigerante * quantidade;
            System.out.println("Valor a pagar: " + valor);

                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                break;

        }
        } while(opc != 0);
    }
}
