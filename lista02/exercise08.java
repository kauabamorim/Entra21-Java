package lista02;
import java.util.Scanner;

import javax.xml.stream.events.NotationDeclaration;

public class exercise08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int pesoMaior = 4;
        int pesoMenor = 3;
        int codigoAluno;
        int codigoAlunoA = 30112004;
        float notaAlunoA1 = 7;
        float notaAlunoA2 = 8;
        float notaAlunoA3 = 6;
        float somaNotaEPeso1, somaNotaEPeso2, somaNotaEPeso3;
        float mediaFinal;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Digite o seu codigo de Aluno: ");
        codigoAluno = scanner.nextInt();

        if(codigoAluno == codigoAlunoA) 
        {
            if(notaAlunoA1 > notaAlunoA2 && notaAlunoA1 > notaAlunoA3)
            {
                somaNotaEPeso1 = notaAlunoA1 * pesoMaior;
                somaNotaEPeso2 = notaAlunoA2 * pesoMenor;
                somaNotaEPeso3 = notaAlunoA3 * pesoMenor;

                mediaFinal = somaNotaEPeso1 + somaNotaEPeso2 + somaNotaEPeso3;

                if(mediaFinal < 7){

                    System.out.println("REPROVADO");

                } else if (mediaFinal >= 7) {
                    System.out.println("Seu codigo aluno é: " + codigoAluno);
                    System.out.println("suas notas sao: " + notaAlunoA1 + " " + notaAlunoA2 + " " + notaAlunoA3);
                    System.out.println("sua media final é: " + mediaFinal);
                }


            } else if(notaAlunoA2 > notaAlunoA1 && notaAlunoA2 > notaAlunoA3) {

                somaNotaEPeso1 = notaAlunoA2 * pesoMaior;
                somaNotaEPeso2 = notaAlunoA1 * pesoMenor;
                somaNotaEPeso3 = notaAlunoA3 * pesoMenor;

                mediaFinal = somaNotaEPeso1 + somaNotaEPeso2 + somaNotaEPeso3;

                if(mediaFinal < 7){

                    System.out.println("REPROVADO");

                } else if (mediaFinal >= 7) {
                    System.out.println("Seu codigo aluno é: " + codigoAluno);
                    System.out.println("suas notas sao: " + notaAlunoA1 + " " + notaAlunoA2 + " " + notaAlunoA3);
                    System.out.println("sua media final é: " + mediaFinal);
                }

            } else if(notaAlunoA3 > notaAlunoA1 && notaAlunoA3 > notaAlunoA2) {

                somaNotaEPeso1 = notaAlunoA3 * pesoMaior;
                somaNotaEPeso2 = notaAlunoA1 * pesoMenor;
                somaNotaEPeso3 = notaAlunoA2 * pesoMenor;

                mediaFinal = somaNotaEPeso1 + somaNotaEPeso2 + somaNotaEPeso3;
                

                if(mediaFinal < 7){

                    System.out.println("REPROVADO");

                } else if (mediaFinal >= 7) {
                    System.out.println("Seu codigo aluno é: " + codigoAluno);
                    System.out.println("suas notas sao: " + notaAlunoA1 + " " + notaAlunoA2 + " " + notaAlunoA3);
                    System.out.println("sua media final é: " + mediaFinal);
                }

            }
        } else 
        {
            do {

                System.out.println("Digite o seu codigo de aluno Novamente: ");
                codigoAluno = scanner.nextInt();

                if(codigoAluno == codigoAlunoA) {
                    System.out.println("suas notas sao: " + notaAlunoA1 + " " + notaAlunoA2 + " " + notaAlunoA3);
                }
            } while (codigoAluno != 30112004);
        }

    }
}
