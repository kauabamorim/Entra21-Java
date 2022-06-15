package lista03;

public class exercise08 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean isPrimo = true;

        for (int j = 92; j < 107; j++) {

            isPrimo = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo && j != 1) {
                System.out.println("O numero " + j + " é primo");

            } else {
                System.out.println("O numero " + j + " não é primo");
            }
        }
    }
}
