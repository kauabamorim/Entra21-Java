package lista03;

public class exercise01 {
    public static void main(String[] args) {

        int sobraNumeroParImpar;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 100; i < 200; i++) {

            sobraNumeroParImpar = (i % 2);

            if (sobraNumeroParImpar >= 1) {
                System.out.println("O Numero " + (i) + " é impar");
            }
        }
    }
}