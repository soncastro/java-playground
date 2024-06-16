package com.songomes.javatraining.aleatorio;

import java.util.Calendar;
import java.util.Date;

public class Teste03 {

    public static void main(String[] args) {
        // Cria uma instância de Calendar com a data atual
        Calendar calendar = Calendar.getInstance();

        // Subtrai 5 anos da data atual
        calendar.add(Calendar.YEAR, -5);

        // converte o objeto Calendar para objeto Date
        Date dateFiveYearsAgo = calendar.getTime();

        // Print da data 5 anos atrás
        System.out.println(dateFiveYearsAgo);
    }

}
