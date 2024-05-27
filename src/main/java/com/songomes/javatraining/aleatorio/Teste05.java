package com.songomes.javatraining.aleatorio;

import java.util.HashSet;
import java.util.Set;

public class Teste05 {

    public static void main(String[] args) {

        Set<Long> teste = new HashSet<Long>();
        teste.add(1L);
        teste.add(1L);
        teste.add(2L);

        System.out.println("---------");
        System.out.println(teste.size());
        System.out.println("---------");
        for (Long t : teste) {
            System.out.println(t);
        }
        System.out.println("---------");


    }

}
