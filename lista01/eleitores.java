package lista01;
import java.util.Scanner;

public class eleitores {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int totalEleitores, totalVotosBrancos, totalVotosNulos, totalVotosValidos;
        float percentuaDeVotosBrancos, percentuaDeVotosNulos, percentuaDeVotosValidos;

        System.out.print("Informe o numero total de eleitores: ");
        totalEleitores = scanner.nextInt();

        System.out.print("votos em branco: ");
        totalVotosBrancos = scanner.nextInt();
        
        System.out.print("votos nulos: ");
        totalVotosNulos = scanner.nextInt();

        System.out.print("votos validos: ");
        totalVotosValidos = scanner.nextInt();

        percentuaDeVotosBrancos = (totalVotosBrancos * 100) / totalEleitores;
        percentuaDeVotosNulos = (totalVotosNulos * 100) / totalEleitores;
        percentuaDeVotosValidos = (totalVotosValidos * 100) / totalEleitores;

        System.out.println("O percentual de votos brancos foi de: " + percentuaDeVotosBrancos + "%");
        System.out.println("O percentual de votos nulos foi de: " + percentuaDeVotosNulos + "%");
        System.out.println("O percentual de votos validos foi de: " + percentuaDeVotosValidos + "%");

        scanner.close();

        /* Pega uma coisa faz * 100 e / pelo total*/


    }
}
