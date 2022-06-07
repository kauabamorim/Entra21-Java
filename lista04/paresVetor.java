package lista04;

public class paresVetor {
    public static void main(String[] args) {

        int numerosPares[] = new int[101];

        for (int i = 0; i <= 100; i += 2) {

            numerosPares[i] = i;

            System.out.println(numerosPares[i]);
        }
    }
}
