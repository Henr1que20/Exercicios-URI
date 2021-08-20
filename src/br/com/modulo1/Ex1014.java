package br.com.modulo1;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double consumoMedio = x / y;
        System.out.printf("%.3f%s" , consumoMedio, " Km/l\n");
        sc.close();
    }
}
