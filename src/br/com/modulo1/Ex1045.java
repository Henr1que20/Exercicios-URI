package br.com.modulo1;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double aux;

        if (b > a){
            aux = a;
            a = b;
            b = aux;
        }

        if (c > a){
            aux = a;
            a = c;
            c = aux;
        }

        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (Math.pow(a,2) == (Math.pow(b, 2) + Math.pow(c, 2))){
            System.out.println("TRIANGULO RETANGULO");
        }
        if (Math.pow(a,2) > (Math.pow(b, 2) + Math.pow(c, 2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if (Math.pow(a,2) < (Math.pow(b, 2) + Math.pow(c, 2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c && a == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a == b && b != c || b == c && c != a || a == c && c != b){
            System.out.println("TRIANGULO ISOSCELES");
        }
        sc.close();
    }
}
