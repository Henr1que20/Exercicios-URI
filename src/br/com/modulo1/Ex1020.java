package br.com.modulo1;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qtdTotalDias = input.nextInt();

        int gtdAnos = qtdTotalDias / 365;
        qtdTotalDias = qtdTotalDias % 365;

        int qtdMeses = qtdTotalDias / 30;
        qtdTotalDias = qtdTotalDias % 30;

        int qtdDias = qtdTotalDias;

        System.out.println(gtdAnos + " anos (s)");
        System.out.println(qtdMeses + " mes (s)");
        System.out.println(qtdDias + " dia (s)");

        input.close();

    }

}
