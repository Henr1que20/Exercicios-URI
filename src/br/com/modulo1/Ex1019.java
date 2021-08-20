package br.com.modulo1;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int horas = 0;
        while (n >= 3600){
            horas++;
            n -= 3600;
        }

        int minutos = 0;
        while(n >= 60){
            minutos++;
            n -= 60;
        }

        int segundos = n;

        System.out.println(horas+":"+minutos+":"+segundos);

    }
}
