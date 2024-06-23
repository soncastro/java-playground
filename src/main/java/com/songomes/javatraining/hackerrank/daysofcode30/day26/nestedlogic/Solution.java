package com.songomes.javatraining.hackerrank.daysofcode30.day26.nestedlogic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String strD1 = scan.nextLine();
        String strD2 = scan.nextLine();

        Integer d1_dia = Integer.valueOf(strD1.split(" ")[0]);
        Integer d1_mes = Integer.valueOf(strD1.split(" ")[1]);
        Integer d1_ano = Integer.valueOf(strD1.split(" ")[2]);

        Integer d2_dia = Integer.valueOf(strD2.split(" ")[0]);
        Integer d2_mes = Integer.valueOf(strD2.split(" ")[1]);
        Integer d2_ano = Integer.valueOf(strD2.split(" ")[2]);

        if (d1_dia >= 1 && d1_dia <= 31) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (d2_dia >= 1 && d2_dia <= 31) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (d1_mes >= 1 && d1_mes <= 12) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (d2_mes >= 1 && d2_mes <= 12) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (d1_ano >= 1 && d1_ano <= 3000) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (d2_ano >= 1 && d2_ano <= 3000) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        LocalDate d1_date_localdate = LocalDate.of(d1_ano, d1_mes, d1_dia);
        LocalDate d2_date_localdate = LocalDate.of(d2_ano, d2_mes, d2_dia);

        int fine = 0;
        long diff = 0;

        if (d2_ano < d1_ano) {
            fine = 10000;
            diff = 1;
        }
        else if (d1_ano.equals(d2_ano)) {
            if (d2_mes < d1_mes) {
                fine = 500;
                diff = Math.abs(ChronoUnit.MONTHS.between(d1_date_localdate, d2_date_localdate));
            }
            else if (d2_mes.equals(d1_mes) && d2_dia < d1_dia) {
                fine = 15;
                diff = Math.abs(ChronoUnit.DAYS.between(d1_date_localdate, d2_date_localdate));
            }
        }

        System.out.println(fine * diff);
    }
}