package com.songomes.javatraining.hackerrank.daysofcode30.day8.dictionariesandmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] argh) {

        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n >= 1 && n <= 100000) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();

            phoneBook.put(name, phone);
        }

        int q = 0;
        while (in.hasNext()) {
            q++;
            if (q >= 1 && q <= 100000) {
                // ok
            } else {
                break;
            }

            String s = in.next();

            Integer value = phoneBook.get(s);

            if (value != null) {
                System.out.println(s + "=" + value);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();

    }

}
