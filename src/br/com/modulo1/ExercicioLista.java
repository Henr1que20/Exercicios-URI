package br.com.modulo1;


import java.util.*;

public class ExercicioLista {
    public static void main(String[] args) {



        //List<String> dia = new ArrayList<String>(Arrays.asList("red","blue","gray","purpll"));

        //List<String> cores = Arrays.asList("red","blue","gray","purpll");

        List<String> cores = new ArrayList<String>();

        cores.add("Red");
        cores.add("Green");
        cores.add("Greedn");
        cores.add("Orange");
        cores.add("White");
        cores.add("Black");





        List<String> colors11 = Arrays.asList("red","Green","Black","While","Pink");

        List<String> colors2 = Arrays.asList("red","Green","Black","Pink");

        //colors11.retainAll(colors2);

        colors2.retainAll(colors11);

        System.out.println(colors2);

        System.out.println("--------------------------");


        System.out.println(cores);
        Collections.sort(cores);
        System.out.println(cores);

        System.out.println("_______________________________");

        Collections.reverse(cores);

        System.out.println(cores);

        System.out.println("_______________________________");


        SortedSet<String> corres = new TreeSet<>();
        corres.add("Red");
        corres.add("Green");
        corres.add("Green");
        corres.add("Orange");
        corres.add("White");
        corres.add("Black");

        System.out.println(corres);

    }
}
