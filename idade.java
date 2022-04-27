import java.util.Scanner;

public class idade {

    public static void main(String[] args) 
    {
        int diasNoAno = 365;
        int meses = 0;
        int anoEmDias = 2022;
        int idadeEmDias;
        int dias;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("==== IDADE ====");
        System.out.print("Digite sua idade em dias: ");
        idadeEmDias = scanner.nextInt();

        anoEmDias =  idadeEmDias / diasNoAno;
        meses = (idadeEmDias % diasNoAno) / 30;
        dias = (idadeEmDias % diasNoAno) % 30;

        System.out.println("Ano(s): " + anoEmDias + " " + "Mes: " + meses + " " + "Dias: "+ dias);

    }
    
}
