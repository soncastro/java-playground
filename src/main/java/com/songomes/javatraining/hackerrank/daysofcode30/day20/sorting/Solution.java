package com.songomes.javatraining.hackerrank.daysofcode30.day20.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {

        int n = -1;
        List<Integer> a = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            n = Integer.parseInt(bufferedReader.readLine().trim());

            a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
        }

        if (n >= 2 && n <= 600) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numSwapsAux = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int valueTemp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, valueTemp);
                    numSwapsAux++;
                    numSwaps++;
                }
            }
            if (numSwapsAux == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }

}
