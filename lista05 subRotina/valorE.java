import java.util.Scanner;

public class valorE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.print("Informe um Numero: ");
        numero = scanner.nextInt();

        float fatorial = Fatorial(numero);
        System.out.println(fatorial);

        scanner.close();
    }
    public static float Fatorial(float numero) {

        int fator = 1;
        float valorE = 1;

        for(int i = 1; i <= numero; i++){
            fator = 1;

            for(int j = i; j > 0; j--){
                fator *= i;
            }
            valorE += 1 / (float) fator;
        }
        return valorE;
    }
}
