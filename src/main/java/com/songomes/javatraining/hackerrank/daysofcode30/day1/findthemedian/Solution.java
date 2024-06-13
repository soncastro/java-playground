package com.songomes.javatraining.hackerrank.daysofcode30.day1.findthemedian;

import java.io.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {

        if (new BigDecimal(String.valueOf(arr.size())).remainder(new BigDecimal("2")).compareTo(BigDecimal.ZERO) != 0) {
            throw new IllegalArgumentException();
        }

        if (arr.size() >= 1 && arr.size() <= 1000001) {
            // ok!
        } else {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
        }

        return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.findMedian(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
