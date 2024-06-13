package com.songomes.javatraining.hackerrank.daysofcode30.day10.binarynumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n >= 1 && n <= 1000000) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        int qtdMax = 0;
        int qtdAux = 0;
        int q = n;

        while (q != 0) {

            BigDecimal numQ = new BigDecimal(Integer.toString(q));

            BigDecimal resultadoDivisao = numQ.divide(new BigDecimal(2));
            q = resultadoDivisao.intValue();

            BigDecimal resultadoRestoDivisao = numQ.remainder(new BigDecimal(2));
            int resto = resultadoRestoDivisao.intValue();

            if (resto == 1) {
                qtdAux++;
                if (qtdAux > qtdMax) {
                    qtdMax = qtdAux;
                }
            } else {
                qtdAux = 0;
            }
        }

        System.out.println(qtdMax);

        bufferedReader.close();
    }
}