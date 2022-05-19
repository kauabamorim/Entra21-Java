import java.util.Scanner;

public class custoConsumidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valorCarro;

        System.out.print("Informe o valor do carro: ");
        valorCarro = scanner.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        float resultado = calculoConsumidor(valorCarro);
        System.out.println("Custo do Consumidor: " + resultado);

        scanner.close();
    }
    public static float calculoConsumidor(float valorCarro) {
        float distribuidor = 0.28f;
        float impostos = 0.45f;

        float resultado = (valorCarro * distribuidor) * impostos;

        return resultado;
    }
}
