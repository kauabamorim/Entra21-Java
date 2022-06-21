package subRotina;

public class multiplicacaoRotina {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int multiplicacao = Multiplicacao(8, 9, 2);
        System.out.println("Multiplicacao: " + multiplicacao);
    }
    public static int Multiplicacao(int n1, int n2, int n3) {
        int multiplicacao = (n1 * n2 * n3);

        return multiplicacao;
    }
}
