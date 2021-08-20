package br.com.modulo1;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hrInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();

        int hrFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int hrsJogo = 0;
        int minutosJogo = 0;

        do{
           hrsJogo++;
           hrInicial++;

           if (hrInicial == 24){
               hrInicial = 0;
            }
        }while (hrInicial != hrFinal);

        if(minutoInicial > minutoFinal){
             minutosJogo = minutoFinal - minutoInicial;
             hrsJogo -= 1;
             minutosJogo += 60;
        }else{
             if(minutoInicial == minutoFinal){
                  minutosJogo = 0;
                }else{
                    do{
                      minutosJogo++;
                      minutoInicial++;

                      if (minutoInicial == 60){
                          minutoInicial = 0;
                      }
                    }while (minutoInicial != minutoFinal);
            }
       }
       System.out.println("O JOGO DUROU "+hrsJogo+" HORA(S) E "+minutosJogo+" MINUTO(S");

       sc.close();

    }
}
