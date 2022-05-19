import java.util.Scanner;

public class revendedoraCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        int carrosVendidos, totalVendas, salario, recebeCarro;

        System.out.print("Numero de carros Vendidos: ");
        carrosVendidos = scanner.nextInt();

        System.out.print("Valor total de suas Vendas: ");
        totalVendas = scanner.nextInt();

        System.out.print("Informe o seu salario: ");
        salario = scanner.nextInt();

        System.out.print("Quanto voce recebe por venda de carro: ");
        recebeCarro = scanner.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        float resultado = calculoCarros(carrosVendidos, totalVendas, salario, recebeCarro);
        System.out.println("Salario Com Comissao: " + resultado);

        scanner.close();
    }
    public static float calculoCarros(float carrosVendidos, float totalVendas, float salario, float recebeCarro) {

        float salarioComissao = salario + (recebeCarro * carrosVendidos * 0.05f);
        

        return salarioComissao;
    }
}
