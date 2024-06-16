package com.songomes.javatraining.hackerrank.daysofcode30.day3.introtoconditionalstatements;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N >= 1 && N <= 100) {
            // do nothing
        } else {
            throw new IllegalArgumentException();
        }

        if (N % 2 == 0) {

            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }
            else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }

    }
}

