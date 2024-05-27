package com.songomes.javatraining.hackerrank.day1.timeconversion;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {

        s = s.trim();

        Pattern p = Pattern.compile("[0-1][0-9]:[0-5][0-9]:[0-5][0-9](AM|PM)");
        Matcher m = p.matcher(s);

        if (!m.matches()) {
            throw new IllegalArgumentException();
        }

        String[] numeros = s.split(":");
        String am_pm = numeros[2].substring(2);
        numeros[2] = numeros[2].replace(am_pm, "");

        String hora = null;
        int int_hora = Integer.parseInt(numeros[0]);

        if (am_pm.equals("AM")) {

            if (int_hora == 12) {
                hora = "00";
            } else {
                hora = numeros[0];
            }

        } else {

            if (int_hora == 12) {
                hora = "12";
            } else {
                hora = String.valueOf(int_hora + 12);
            }
        }

        String saida = hora + ":" + numeros[1] + ":" + numeros[2];
        return saida;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

