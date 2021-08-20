package br.com.modulo1;

import java.util.Locale;
import java.util.Scanner;

public class Ex1043 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if(A < B + C && B < A + C && C < A + B){
            System.out.printf("Perimetro = %.1f", (A + B + C));
        }else{
            System.out.printf("Area = %.1f", (C * (A + B)/2));
        }

        sc.close();
    }
}
