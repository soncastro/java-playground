package com.songomes.javatraining.aleatorio;

import java.util.Calendar;
import java.util.Date;

public class Teste01 {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date();

        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 17);

        // Difference in milliseconds
        long differenceMillis = Math.abs(c.getTime().getTime() - date1.getTime());

        System.out.println("Difference: " + differenceMillis + " milliseconds");
    }

}
