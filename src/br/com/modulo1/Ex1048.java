package br.com.modulo1;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste = salario;
        int porcentagem = 0;

        if (salario <= 400){
            salario += salario * 0.15;
            porcentagem = 15;
        }else if (salario <= 800){
            salario += salario * 0.12;
            porcentagem = 12;
        }else if (salario <= 1200){
            salario += salario * 0.1;
            porcentagem = 10;
        }else if (salario <= 2000){
            salario += salario * 0.07;
            porcentagem = 7;
        }else{
            salario += salario * 0.04;
            porcentagem = 4;
        }

        reajuste = salario - reajuste;

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: "+porcentagem+"%");

        sc.close();

    }
}
