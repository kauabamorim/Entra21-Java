package lista03;

import java.util.Scanner;

public class exercise12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int salario = 0, filhos = 0;
            int habi = 0;
            int ms = 0, mf = 0;
            int salarioMaior;

            scanner.close();

            for(int i = 0; i < 5; i++){

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.print("Informe o salario R$: ");
                salario = scanner.nextInt();
                salario += salario;

                System.out.print("Quantidade de Filhos: ");
                filhos = scanner.nextInt();
                filhos += filhos;

                if(i == 0){
                    salarioMaior = salario;
                }

                habi++;

                ms = salario / habi;
                mf = filhos / habi;

            }
            System.out.println(habi);
            System.out.println(salario);
            System.out.println("média do salário da população: " + ms);
            System.out.println("média do número de filhos: " + mf);
        }
}
