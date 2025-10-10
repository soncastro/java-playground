package com.songomes.javatraining.aleatorio;

import java.math.BigDecimal;

public class Teste15 {

    public static void main(String[] args) {

        String teste = "[teste]a[teste2]";
        String[] teste2 = teste.split("\\]\\[");

        System.out.println(teste2.length);
        System.out.println(teste2[0]);

        System.out.println(new BigDecimal("20000").compareTo(new BigDecimal("21000")));
    }

}
