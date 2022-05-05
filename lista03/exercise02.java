package lista03;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}
