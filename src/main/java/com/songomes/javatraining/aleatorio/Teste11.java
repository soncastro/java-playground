package com.songomes.javatraining.aleatorio;

import java.util.Calendar;

public class Teste11 {
    public static void main(String[] args) {
        // Configuração das datas específicas
        Calendar startDate = Calendar.getInstance();
        startDate.set(1950, Calendar.JANUARY, 1); // 1 de janeiro de 1950

        Calendar endDate = Calendar.getInstance();
        endDate.set(2023, Calendar.JUNE, 19); // 19 de junho de 2023

        // Calcular a diferença em dias
        int daysDifference = calculateDaysDifference(startDate, endDate);
        System.out.println("Diferença em dias: " + daysDifference);
    }

    public static int calculateDaysDifference(Calendar startDate, Calendar endDate) {
        // Normalizando as horas para evitar problemas de cálculo de diferença
        startDate.set(Calendar.HOUR_OF_DAY, 0);
        startDate.set(Calendar.MINUTE, 0);
        startDate.set(Calendar.SECOND, 0);
        startDate.set(Calendar.MILLISECOND, 0);

        endDate.set(Calendar.HOUR_OF_DAY, 0);
        endDate.set(Calendar.MINUTE, 0);
        endDate.set(Calendar.SECOND, 0);
        endDate.set(Calendar.MILLISECOND, 0);

        // Obter os milissegundos de cada data
        long startMillis = startDate.getTimeInMillis();
        long endMillis = endDate.getTimeInMillis();

        System.out.println(startMillis);
        System.out.println(endMillis);

        // Calcular a diferença em milissegundos
        long diffMillis = endMillis - startMillis;

        // Converter a diferença de milissegundos para dias
        return (int) (diffMillis / (24 * 60 * 60 * 1000));
    }
}
