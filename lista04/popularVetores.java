import java.util.Scanner;

public class popularVetores {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

    //Arrays
         int A[] = new int[10];
         int quantidadePrimos = 0;
         int tamanhoPrimos = 0;
         boolean primo = true;

    //Scanner
            for (int i = 0; i < A.length; i++) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.print("Informe o " + (i + 1) + "° numero: ");
                A[i] = read.nextInt();
            }

    //Tamanho VET B
            for (int i = 0; i < A.length; i++) {
                primo = true;
                for (int j = 2; j < A[i]; j++) {
                   if (A[i] % j == 0) {
                       primo = false;
                       break;
                   }
                }
                if (primo) {
                    tamanhoPrimos++;
                }
            }


      //Numeros Primos
            int B[] = new int[tamanhoPrimos];

            for (int i = 0; i < A.length; i++) {
                primo = true;

                for (int j = 2; j < A[i]; j++) {
                   if (A[i] % j == 0) {
                       primo = false;
                       break;
                       }
                }

                if (primo) {
                    B[quantidadePrimos] = A[i];
                    quantidadePrimos++;
                }
             }

             System.out.print("\033[H\033[2J");
             System.out.flush();

            for (int i : B)
                System.out.println(i);
    }
}
