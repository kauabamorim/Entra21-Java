import java.util.Scanner;

public class crivoEratostenes {
    public static void main(String[] args) {

        int count = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o numero maximo: ");
        int maxNum = scanner.nextInt();

        scanner.close();

        int numExcluidos[] = new int [maxNum + 1];

        int primos[] = new int [1];

        for (int i = 2; i <= maxNum; i++) {

            for (int j = 2; j < i; j++) { // Primo

                if (i % j == 0) { // Removendo os multiplos
                    numExcluidos[i] = i;
                }
            }

            if (i != numExcluidos[i]) {

                int guardarPrimos[] = new int [primos.length + 1]; // Guardar os Num Primos

                for (int j = 0; j < primos.length; j++) {
                    guardarPrimos[j] = primos[j];
                }

                count++;
                primos = new int [count];

                for (int j = 0; j < primos.length; j++) {
                    primos[j] = guardarPrimos[j];
                }

                primos[count - 1] = i;

            }
        }

        for (int i : primos) { // Mostrar os numeros Primos
            System.out.println(i);
        }
        
        System.out.println("Quantos Primos: " + primos.length);
    }
}