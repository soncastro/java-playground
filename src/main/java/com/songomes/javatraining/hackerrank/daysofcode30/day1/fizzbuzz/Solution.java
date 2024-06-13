package com.songomes.javatraining.hackerrank.daysofcode30.day1.fizzbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {

        if (n > 0 && n < (2 * 100000)) {
            // do nothing
        } else {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i <= n; i++) {

            BigDecimal num = new BigDecimal(String.valueOf(i));

            boolean condicao1 = false;
            boolean condicao2 = false;

            if (num.remainder(new BigDecimal("3")).compareTo(BigDecimal.ZERO) == 0) {
                condicao1 = true;
            }

            if (num.remainder(new BigDecimal("5")).compareTo(BigDecimal.ZERO) == 0) {
                condicao2 = true;
            }

            if (condicao1 && condicao2) {
                System.out.println("FizzBuzz");
            } else if (condicao1) {
                System.out.println("Fizz");
            } else if (condicao2) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}

