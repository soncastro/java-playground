package com.songomes.javatraining.lambda;

import java.sql.SQLInvalidAuthorizationSpecException;

public class Main {

    public static void main(String[] args) {

        Saudacao saudacao = new Saudacao() {
            @Override
            public void dizerOla() {
                System.out.println("Olá mundo!");
            }
        };
        saudacao.dizerOla();

        Saudacao saudacao2 = () -> System.out.println("Olá mundo com lambda!");
        saudacao2.dizerOla();

    }

}
