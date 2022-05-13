package Vetor;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float medias [] = new float [5]; // < -- vetor
        // matriz --> medias [] [] = new float [] []; 
        medias[0] = 10;
        medias[1] = 9.5f;

        for(float f : medias) {
            System.out.println(f);
        }
        

        // for(int = 0; i < medias.length; i++){

        System.out.println(medias[1]);
    }
}
