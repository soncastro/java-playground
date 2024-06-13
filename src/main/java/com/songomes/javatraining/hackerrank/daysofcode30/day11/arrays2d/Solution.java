package com.songomes.javatraining.hackerrank.daysofcode30.day11.arrays2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (arr.get(i).get(j) >= -9 && arr.get(i).get(j) <= 9) {
                    if (arr.get(i).get(j) > 0) {
                        // ok
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum = calculateHourglassSum(arr, i, j);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);

        bufferedReader.close();
    }

    private static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
        int soma = 0;
        soma += arr.get(row).get(col);
        soma += arr.get(row).get(col + 1);
        soma += arr.get(row).get(col + 2);
        soma += arr.get(row + 1).get(col + 1);
        soma += arr.get(row + 2).get(col);
        soma += arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
        return soma;
    }

}
