package lista01;
import java.util.Scanner;

public class  mediaEFrquencia {
  public static void main(String[] args) {

        float nota1, nota2, nota3, media;
        int frequencia;
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); /* Limpar Terminal*/
        System.out.flush();
    
        System.out.println("===== NOTAS ===== ");
        System.out.print("digite sua nota: ");
        nota1 = scanner.nextFloat();

        System.out.print("digite sua nota: ");
        nota2 = scanner.nextFloat();    
    
        System.out.print("digite sua nota: ");
        nota3 = scanner.nextFloat();

        System.out.print("Diga sua frequencia: ");
        frequencia = scanner.nextInt();

        scanner.close();

        media = (nota1 + nota2 + nota3) / 3;

        if(media < 7.0)
        {
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("===== RESULTADO ====");
          System.out.println("\nREPROVADO POR NOTA !! :)");
          System.out.printf("Sua media é: " + "%.1f", media);
        } 
        else if (media >= 7.0){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("===== RESULTADO ====");
          System.out.println("\n ESTA APROVADO POR NOTA!!");
          System.out.printf("Sua media é: " + "%.1f", media);
        } 
        if (frequencia >= 75) {
            System.out.print("\nVOCE ESTA APROVADO POR FRQUENCIA COM: " + frequencia + "%");
        } else if (frequencia < 75) 
        {
            System.out.println("\nVOCE ESTA REPROVADO POR FREQUENCIA COM: " + frequencia + "%");
        } 
        if(media >= 7.0 && frequencia >= 75) 
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("VOCE ESTA APROVADO EM NOTA E FREQUENCIA !!! :D");
        }
        else if (media < 7.0 && frequencia < 75) 
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("VOCE ESTA REPROVADO POR NOTA E FREQUENCIA");
        }
  }
}