package br.com.modulo1;

import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1*2+n2*3+n3*4+n4*1)/(2+3+4+1);

        System.out.println("Media: "+media);

        if(media >= 7){
            System.out.println("Aluno aprovado");
        }else if(media < 5){
            System.out.println("Aluno reprovado");
        }else{
            System.out.println("Aluno em exame");
            System.out.print("Nota do exame: ");
            double nf = sc.nextDouble();

            media = (media + nf)/2;

            if (media >= 5){
                System.out.println("Aluno aprovado");
            }else{
                System.out.println("Aluno reprovado");
            }

            System.out.println("Media final: "+media);
        }



    }
}
