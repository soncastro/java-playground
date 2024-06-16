package com.songomes.javatraining.hackerrank.daysofcode30.day12.inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;

        if (firstName.length() >= 1 && firstName.length() <= 10) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (lastName.length() >= 1 && lastName.length() <= 10) {
            // ok
        } else {
            throw new IllegalArgumentException();
        }

        if (identification > 9999999) {
            throw new IllegalArgumentException();
        }

        for (int s : testScores) {
            if (s >= 0 && s <= 100) {
                // ok
            } else {
                throw new IllegalArgumentException();
            }
        }

    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public String calculate() {

        int soma = 0;
        for (int s : this.testScores) {
            soma += s;
        }

        java.math.BigDecimal bdSoma = new java.math.BigDecimal(Integer.toString(soma));
        java.math.BigDecimal res = bdSoma.divide(new java.math.BigDecimal(Integer.toString(this.testScores.length)), 2, java.math.RoundingMode.HALF_UP);

        String grade = null;

        if (res.compareTo(new java.math.BigDecimal("90")) >= 0 && res.compareTo(new java.math.BigDecimal("100")) <= 0) {
            grade = "O";
        } else if (res.compareTo(new java.math.BigDecimal("80")) >= 0 && res.compareTo(new java.math.BigDecimal("90")) < 0) {
            grade = "E";
        } else if (res.compareTo(new java.math.BigDecimal("70")) >= 0 && res.compareTo(new java.math.BigDecimal("80")) < 0) {
            grade = "A";
        } else if (res.compareTo(new java.math.BigDecimal("55")) >= 0 && res.compareTo(new java.math.BigDecimal("70")) < 0) {
            grade = "P";
        } else if (res.compareTo(new java.math.BigDecimal("40")) >= 0 && res.compareTo(new java.math.BigDecimal("55")) < 0) {
            grade = "D";
        } else if (res.compareTo(new java.math.BigDecimal("40")) < 0) {
            grade = "T";
        } else {
            throw new IllegalArgumentException();
        }

        return grade;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}