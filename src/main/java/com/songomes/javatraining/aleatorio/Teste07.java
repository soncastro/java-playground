package com.songomes.javatraining.aleatorio;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Teste07 {

    public static void main(String[] args) {

        Date dateNow = new Date();
        Date dateWeekBefore = new Date(dateNow.getTime() - 7 * 24 * 3600 * 1000);

        System.out.println(calculateDaysBetweenDates(dateWeekBefore, dateNow));

    }

    private static int calculateDaysBetweenDates(Date date1, Date date2) {
        return (int) ((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
    }

    private static void printMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println("k:" + key + " - v:" + map.get(key));
        }
    }

    private static void testMap() {
        Map<String, String> teste = new HashMap<String, String>();
        teste.put("teste1", "teste1");
        teste.put("teste1", "teste2");
        teste.put("teste2", "teste3");
        teste.put("teste2", "teste2");

        printMap(teste);
    }

}
