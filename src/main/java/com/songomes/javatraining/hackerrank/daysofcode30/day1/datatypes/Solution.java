package com.songomes.javatraining.hackerrank.daysofcode30.day1.datatypes;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        int i2 = scan.nextInt();
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        double d2 = scan.nextDouble();
        System.out.println(d + d2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println(s + s2);

        scan.close();
    }
}