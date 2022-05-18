import java.util.Scanner;

public class expotenciacal {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int expotencial = Expotencial(2, 3);
        System.out.println(expotencial);
    }
    public static int Expotencial(int n1, int n2){
        int resultado = 1;

        for (int i = 0; i < n2; i++) {
            resultado *= n1;
        }


        return resultado;
    }
    
}
