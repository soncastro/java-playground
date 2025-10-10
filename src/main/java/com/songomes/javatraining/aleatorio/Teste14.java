package com.songomes.javatraining.aleatorio;

public class Teste14 {

    public static void main(String[] args) {

        String teste = """
            [{"operation":"buy", "unit-cost":10.00, "quantity": 10000},
            {"operation":"sell", "unit-cost":20.00, "quantity": 5000}]
            [{"operation":"buy", "unit-cost":20.00, "quantity": 10000},
            {"operation":"sell", "unit-cost":10.00, "quantity": 5000}]
        """;

        for (int i = 0; i < teste.length(); i++) {
            //System.out.println("|" + teste.substring(i, i + 1) + "|");
        }

        System.out.println(teste);

        String teste2 = teste.replaceAll("\\s+", "");
        String[] items = teste2.split("\\]\\[");

        System.out.println(teste2);
        System.out.println(items.length);
        System.out.println(items[0]);
    }

}
