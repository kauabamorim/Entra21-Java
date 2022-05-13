package Loop.DoWhile;

import java.util.Scanner;

public class paises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int populacaoA, populacaoB;
        float taxaA, taxaB;

        System.out.print("Informe a populacao do pais A: ");
        populacaoA = scanner.nextInt();

        System.out.println("taxa de crescimento: ");
        taxaA = scanner.nextFloat();

        System.out.print("Informe a populacao do pais B: ");
        populacaoB = scanner.nextInt();

        System.out.println("taxa de crescimento: ");
        taxaB = scanner.nextFloat();
        
        int anos = 0;

        while(populacaoA <= populacaoB){

            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;

            anos++;
        }
        System.out.println("Demorou" + anos + " anos");
    }   
}
