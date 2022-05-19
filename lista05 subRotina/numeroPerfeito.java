import java.util.Scanner;

public class numeroPerfeito {

    public static void main(String[] args) {

        Scanner read = new Scanner (System.in);

        System.out.print("Informe um número: ");
        int num = read.nextInt();


        System.out.println("O próximo número perfeito é " + CalcularPerfeito(num));

    }

    public static int CalcularPerfeito(int num) {

         int numPerfeito = 0;
         int soma;
         int cont = 0;

         while(cont == 0) {

            soma = 0;
            num++;
            for (int i = 1; i<num; i++) {
                if (num % i == 0) {
                    soma += i;
                }
            }
            if (soma == num) {
                 numPerfeito = num;
                 cont++;
            }
        }

         return numPerfeito;

    }
}