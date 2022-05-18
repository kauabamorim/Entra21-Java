public class vetorSubRotina {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
    public static int quantidadePrimosLimite(int limite) {
        int quantidade = 0;

        boolean isPrimo = true;
        
        for (int i = 0; i < limite; i++) {
            if (isPrimo(i)) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
