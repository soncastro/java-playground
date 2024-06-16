package com.songomes.javatraining.hackerrank.daysofcode30.day1.minimaxsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {

        if (arr.size() != 5) {
            throw new IllegalArgumentException();
        }

        for (int i : arr) {
            if (i >= 1 && i <= 1000000000) {
                // do nothing
            } else {
                throw new IllegalArgumentException();
            }
        }

        Long[] resultados = new Long[arr.size()];

        int indiceParaExcluir = -1;
        for (int i = 0; i < arr.size(); i++) {
            indiceParaExcluir++;
            Long soma = 0L;
            for (int j = 0; j < arr.size(); j++) {
                if (j != indiceParaExcluir) {
                    soma += arr.get(j);
                }
            }
            resultados[i] = soma;
        }

        Long max = Long.MIN_VALUE;
        for (Long r : resultados) {
            if (r > max) {
                max = r;
            }
        }

        Long min = Long.MAX_VALUE;
        for (Long r : resultados) {
            if (r < min) {
                min = r;
            }
        }

        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
