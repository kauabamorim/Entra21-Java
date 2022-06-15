package lista02;
import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        scanner.close();
        
        switch(idade) 
        {
            case 5:
            case 6:
            case 7:
                System.out.println("Infantil A");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Infantil B");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Juvenil A");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Juvenil B");
                break;
            default:
                System.out.println("Adulto");
                break;
        }
        
    }
}
