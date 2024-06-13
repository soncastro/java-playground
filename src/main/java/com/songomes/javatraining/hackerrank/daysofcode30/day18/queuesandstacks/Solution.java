package com.songomes.javatraining.hackerrank.daysofcode30.day18.queuesandstacks;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    private LinkedList<Character> queue = new LinkedList<>();

    private Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {

        String s = null;

        try (Scanner scan = new Scanner(System.in)) {
            s = scan.nextLine();
        }

        Solution solution = new Solution();

        for (char c : s.toCharArray()) {
            solution.push(c);
            solution.enqueueCharacter(c);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < s.length(); i++) {
            if (solution.popCharacter() != solution.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word, " + s + ", is a palindrome.");
        } else {
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }

    public void push(char ch) {
        this.stack.push(ch);
    }

    public void enqueueCharacter(char ch) {
        this.queue.addLast(ch);
    }

    public char popCharacter() {
        return this.stack.pop();
    }

    public char dequeueCharacter() {
        return this.queue.removeFirst();
    }

}
