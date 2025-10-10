package com.songomes.javatraining.aleatorio;

public class Teste13 {

    public static void main(String[] args) {
        int number1 = 1;
        int number10 = 10;

        showBinaryNumber(number1);
        showBinaryNumber(number10);
    }

    private static void showBinaryNumber(int number) {
        System.out.println(Integer.toBinaryString(number));
        var binaryNumber = String.format("%32s", Integer
                .toBinaryString(number)).replace(' ', '0');
        System.out.println(binaryNumber);
    }

}
