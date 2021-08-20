package br.com.modulo1;

import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dinheiro = sc.nextDouble();

        double notaDe100 = (int)dinheiro / 100;
        dinheiro = dinheiro % 100;

        double notaDe50 = (int)dinheiro / 50;
        dinheiro = dinheiro % 50;

        double notaDe20 = (int)dinheiro / 20;
        dinheiro = dinheiro % 20;

        double notaDe10 = (int)dinheiro / 10;
        dinheiro = dinheiro % 10;

        double notaDe05 = (int)dinheiro / 5;
        dinheiro = dinheiro % 5;

        double notaDe2 = (int)dinheiro / 2;
        dinheiro = dinheiro % 2;

        double moedaDe01 = (int)dinheiro / 1;
        dinheiro = dinheiro % 1;

        double moedaDe50 = 0;
        while (dinheiro >= 0.5){
            moedaDe50++;
            dinheiro -= 0.5;
        }

        double moedaDe25 = 0;
        while (dinheiro >= 0.25){
            moedaDe25++;
            dinheiro -= 0.25;
        }

        double moedaDe10 = 0;
        while (dinheiro >= 0.10){
            moedaDe10++;
            dinheiro -= 0.10;
        }

        double moedaDe05 = 0;
        while (dinheiro >= 0.05){
            moedaDe05++;
            dinheiro -= 0.05;
        }

        double moedaDe01cem = 0;
        while (dinheiro >= 0.01){
            moedaDe01cem++;
            dinheiro -= 0.01;
        }



        System.out.println("NOTAS: ");
        System.out.println(notaDe100 + " notas de R$ 100.00");
        System.out.println(notaDe50 + " notas de R$ 50.00");
        System.out.println(notaDe20 + " notas de R$ 20.00");
        System.out.println(notaDe10 + " notas de R$ 10.00");
        System.out.println(notaDe05 + " notas de R$ 5.00");
        System.out.println(notaDe2 + " notas de R$ 2.00");

        System.out.println("MOEDAS: ");
        System.out.println(moedaDe01 +" moedas de R$ 1.00");
        System.out.println(moedaDe50 +" moedas de R$ 0.50");
        System.out.println(moedaDe25 +" moedas de R$ 0.25");
        System.out.println(moedaDe10 +" moedas de R$ 0.10");
        System.out.println(moedaDe05 +" moedas de R$ 0.05");
        System.out.println(moedaDe01cem +" moedas de R$ 0.01");


        sc.close();
    }
}
