package subRotina;

public class primoSubRotina {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean primo = Primo(7);
        System.out.println(primo);
    }

    public static boolean Primo(int n1) {

        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0 && n1 != 1) {
                return false;
            }
        }
        return true;
    }
}
