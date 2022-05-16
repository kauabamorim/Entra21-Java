import java.util.Scanner;

public class ordemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[10];
        int auxiliar = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Informe o " + (i + 1) + "° numero: ");
            a[i] = scanner.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i] < a[j]) {
                    auxiliar = a[i];
                    a[i] = a[j];
                    a[j] = auxiliar;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
