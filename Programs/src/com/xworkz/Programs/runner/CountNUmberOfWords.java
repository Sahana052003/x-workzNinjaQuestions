package com.xworkz.Programs.runner;

public class CountNUmberOfWords {
    public static void main(String[] args) {
        String input = "W elcome To Java World";

        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words = " + count);
    }
}
