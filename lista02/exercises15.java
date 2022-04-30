import java.util.Scanner;

public class exercises15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float poluicao;

        System.out.println("Digite o indice de poluicao: ");
        poluicao = scanner.nextFloat();

        if(poluicao < 0.3) {
            System.out.println("Nenhuma empresa precisa parar");
        } else if (poluicao >= 0.3 && poluicao < 0.4) {

            System.out.println("O primeiro grupo deve parar");

        } else if (poluicao >= 0.4 && poluicao < 0.5) {

            System.out.println("O primeiro e o segundo grupo param");

        } else if (poluicao >= 0.5 ) {
            System.out.println("Todos os grupos devem ser notificados a paralisarem");
        }
    }
}
