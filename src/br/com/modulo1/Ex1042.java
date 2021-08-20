package br.com.modulo1;

import java.util.Scanner;

public class Ex1042 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 < n2 && n2 < n3 && n1 < n3){
            // n1 n2 n3
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }else if (n1 < n3 && n3 < n2){
            // n1 n3 n2
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);
        }else if (n2 < n3 && n3 < n1){
            // n2 n3 n1
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);
        }else if (n2 < n1 && n1 < n3){
            // n2 n1 n3
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
        }else if (n3 < n1 && n1 < n2){
            // n3 n1 n2
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
        }else{
            // n3 n2 n1
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
        }
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
