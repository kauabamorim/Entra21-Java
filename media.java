import java.util.Scanner;
 
public class  media {
  public static void main(String[] args) {
 
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float media = 0;
   
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
 
        media = (nota1 + nota2 + nota3) / 3;
 
        if(media <= 5.9)
        {
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("===== RESULTADO ====");
          System.out.println("\nEstude Mais!!");
          System.out.printf("Sua media é: " + "%.1f", media);
        }
        else if (media >= 6.0){
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("===== RESULTADO ====");
          System.out.println("\nParabens voce passou!!");
          System.out.printf("Sua media é: " + "%.1f", media);
        }
  }
}
 

