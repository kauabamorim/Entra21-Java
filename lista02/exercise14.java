package lista02;
import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int identificacao;

        float nota1, nota2, nota3, me, ma;

        System.out.println("Digite sua identificacao: ");
        identificacao = scanner.nextInt();

        System.out.println("Escreva as notas: ");
        nota1 = scanner.nextFloat();
        System.out.println("Escreva as notas: ");
        nota2 = scanner.nextFloat();
        System.out.println("Escreva as notas: ");
        nota3 = scanner.nextFloat();

        System.out.println("Qual a sua media de Exercises: ");
        me = scanner.nextFloat();

        ma = (nota1 + nota2 * 2 + nota3 * 3 + me ) / 7;

        if(ma >= 9) {
            System.out.println("sua identificacao: " + identificacao);
            System.out.println("media de exercises: " + me);
            System.out.println("notas: " + nota1 + " " + nota2 + " " + nota3);
            System.out.println("Media de aprovacao: " + ma);
            System.out.println("APROVADO CONCEITO A");
        } else if(ma >= 7.5 && ma < 9) {
            System.out.println("sua identificacao: " + identificacao);
            System.out.println("media de exercises: " + me);
            System.out.println("notas: " + nota1 + " " + nota2 + " " + nota3);
            System.out.println("Media de aprovacao: " + ma);
            System.out.println("APROVADO CONCEITO B");
        }else if(ma >= 6 && ma < 7.5){
            System.out.println("sua identificacao: " + identificacao);
            System.out.println("media de exercises: " + me);
            System.out.println("notas: " + nota1 + " " + nota2 + " " + nota3);
            System.out.println("Media de aprovacao: " + ma);
            System.out.println("APROVADO CONCEITO C");
        }else if(ma >= 4 && ma < 6) {
            System.out.println("sua identificacao: " + identificacao);
            System.out.println("media de exercises: " + me);
            System.out.println("notas: " + nota1 + " " + nota2 + " " + nota3);
            System.out.println("Media de aprovacao: " + ma);
            System.out.println("REPROVADO CONCEITO D");
        } else if(ma < 4) {
            System.out.println("sua identificacao: " + identificacao);
            System.out.println("media de exercises: " + me);
            System.out.println("notas: " + nota1 + " " + nota2 + " " + nota3);
            System.out.println("Media de aprovacao: " + ma);
            System.out.println("REPROVADO CONCEITO E");
        }
    }
}
