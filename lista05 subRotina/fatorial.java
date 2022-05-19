public class fatorial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int fatorial = Fatorial(5, 2);
        System.out.print("Corresponde ao fatorial do primeiro " + fatorial);
    }

    public static int Fatorial(int n1, int n2) {
        int fat = 1;

        for (int i = n1; i >= 1; i--) {
            fat *= i;
            if (fat == n2) {

            }
        }
        return fat;
    }
}
