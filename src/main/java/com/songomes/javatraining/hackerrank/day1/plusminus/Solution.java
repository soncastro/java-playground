package com.songomes.javatraining.hackerrank.day1.plusminus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        if (arr.size() > 0 && arr.size() <= 100) {
            // do nothing
        } else {
            throw new IllegalArgumentException();
        }

        for (int i : arr) {

            if (i >= -100 && i <= 100) {
                // do nothing
            }
            else {
                throw new IllegalArgumentException();
            }
        }

        int qtdPositivo = 0;
        int qtdNegativo = 0;
        int qtdZero = 0;

        for (int i : arr) {
            if (i > 0) {
                qtdPositivo++;
            } else if (i < 0) {
                qtdNegativo++;
            } else {
                qtdZero++;
            }
        }

        BigDecimal total = new BigDecimal(String.valueOf(arr.size()));

        BigDecimal bigDecimal_qtdPositivo = new BigDecimal(String.valueOf(qtdPositivo));
        BigDecimal resPositivo = bigDecimal_qtdPositivo.divide(total, 6, RoundingMode.HALF_UP);

        BigDecimal bigDecimal_qtdNegativo = new BigDecimal(String.valueOf(qtdNegativo));
        BigDecimal resNegativo = bigDecimal_qtdNegativo.divide(total, 6, RoundingMode.HALF_UP);

        BigDecimal bigDecimal_qtdZero = new BigDecimal(String.valueOf(qtdZero));
        BigDecimal resZero = bigDecimal_qtdZero.divide(total, 6, RoundingMode.HALF_UP);

        System.out.println(resPositivo);
        System.out.println(resNegativo);
        System.out.println(resZero);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        if (n != arr.size()) {
            throw new IllegalArgumentException();
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

