package br.com.modulo1;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hrInicial = sc.nextInt();
        int hrFinal = sc.nextInt();

        int hrsJogo = 0;

       do{
            hrInicial++;
            hrsJogo++;

            if(hrInicial == 24){
                hrInicial = 0;
            }
        } while(hrInicial != hrFinal);

        System.out.println("O JOGO DUROU "+hrsJogo+" HORA(S)");
    }
}
