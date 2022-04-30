import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        int i;
        System.out.println("Escreva um numero:");
        a = scanner.nextInt();
        System.out.println("Escreva um numero:");
        b = scanner.nextInt();
        System.out.println("Escreva um numero:");
        c = scanner.nextInt();
        System.out.println("1 ou 2");
        i = scanner.nextInt();
        
        if (i == 1){
            if (a > b && a > c && b > c){
                System.out.println(c + ""  + " "  + b + " "  +a);
            }
            
            else if (a > b && a > c && c > b){
                System.out.println(b + " "  + c + " "  + a);
            }
            
            else if ( b > a && b > c && a > c){
            System.out.println(c + " "  + a + " "  + b);
            }
            
            else if ( b > a && b > c && c > a){
            System.out.println(a + " "  + c + " "  + b);
            }
            
            else if ( c > a && c > b && b > a){
            System.out.println(a + " "  + b + " "  + c);
            }
            
            else if ( c > a && c > b && a > b){
            System.out.println(b + " "  + a + " "  + c);
            }
            }
            
            if ( i == 2){
            
            if (a < b && a < c && b < c){
            System.out.println(c + " "  + b + " "  + a);
            }
            
            else if (a < b && a < c && c < b){
            System.out.println(b + " "  + c + " "  + a);
            }
            
            else if ( b < a && b < c && a < c){
            System.out.println(c + " "  + a + " "  + b);
            }
            
            else if ( b < a && b < c && c < a){
            System.out.println(a + " "  + c + " "  + b);
            }
            
            else if ( c < a && c < b && b < a){
            System.out.println(a + " "  + b + " "  + c);
            }
            
            else if ( c < a && c < b && a < b){
            System.out.println(b + " "  + a + " "  + c);
            }
            }
            
            if ( i == 2 ){
            
            if (a < b && a < c && b < c){
            System.out.println(b + " "  + c + " "  + a);
            }
            
            else if (a < b && a < c && c < b){
            System.out.println(c + " "  + b + " "  + a);
            }
            
            else if ( b < a && b < c && a < c){
            System.out.println(a + " "  + c + " "  + b);
            }
            
            else if ( b < a && b < c && c < a){
            System.out.println(c + " "  + a + " "  + b);
            }
            
            else if ( c < a && c < b && b < a){
            System.out.println(b + " "  + a + " "  + c);
            }
            
            else if ( c < a && c < b && a < b){
            System.out.println(a + " "  + b + " "  + c);
            }
            
            }
            
    }
}
