package com.songomes.javatraining.hackerrank.daysofcode30.day29.bitwiseand;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {

        if (N >= 2 && N <= 1000) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (K >= 2 && K <= N) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        int max = 0;
        for (int i = 2; i < N; i++) {
            for (int j = (i + 1); j <= N; j++) {
                int result = i & j;
                if (result < K && result > max) {
                    max = result;
                }
            }
        }

        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
