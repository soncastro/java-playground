package com.songomes.javatraining.aleatorio;

import java.util.HashMap;
import java.util.Map;

public class Teste06 {

    public static void main(String[] args) {

        Map<String, String> teste = new HashMap<String, String>();
        teste.put("teste1", "teste1");
        teste.put("teste1", "teste2");
        teste.put("teste2", "teste3");
        teste.put("teste2", "teste2");

        for (String key : teste.keySet()) {
            System.out.println("k:" + key + " - v:" + teste.get(key));
        }

    }

}
