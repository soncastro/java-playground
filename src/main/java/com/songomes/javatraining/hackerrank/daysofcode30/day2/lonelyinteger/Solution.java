package com.songomes.javatraining.hackerrank.daysofcode30.day2.lonelyinteger;

import java.io.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int lonelyinteger(List<Integer> a) {

        if (a.size() >= 1 && a.size() < 100) {
            // ok!
        } else {
            throw new IllegalArgumentException();
        }

        BigDecimal qtd = new BigDecimal(String.valueOf(a.size()));
        if (qtd.remainder(new BigDecimal("2")).compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0 && a.get(i) <= 100) {
                // ok!
            } else {
                throw new IllegalArgumentException();
            }
        }

        int qtdUnica = 0;
        int unico = -1;

        for (int i1 : a) {
            int qtdEncontrada = 0;
            for (int i2 : a) {
                if (i1 == i2) {
                    qtdEncontrada++;
                }
            }

            if (qtdEncontrada == 1) {
                qtdUnica++;
                unico = i1;
            }
        }

        if (qtdUnica != 1) {
            throw new IllegalArgumentException();
        }

        return unico;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

