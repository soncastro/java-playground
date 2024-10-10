package com.songomes.javatraining.str;

public class Str01 {

    public static void main(String[] args) {

        String teste1 = "hello";
        String teste2 = "hello";

        System.out.print("output 1: ");
        System.out.println(teste1 == teste2);

        String teste3 = new String("hello");
        String teste4 = new String("hello");

        System.out.print("output 2: ");
        System.out.println(teste3 == teste4);

        System.out.print("output 3: ");
        System.out.println(teste3.equals(teste4));
    }

}
