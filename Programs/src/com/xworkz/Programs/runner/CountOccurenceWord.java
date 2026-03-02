package com.xworkz.Programs.runner;

public class CountOccurenceWord {
    public static void main(String[] args) {

        String input = "Test Automation Java Automation";
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }

            int k;
            for (k = 0; k < i; k++) {
                if (words[i].equalsIgnoreCase(words[k])) {
                    break;
                }
            }

            if (k == i) {
                System.out.println("Count Occurrence of Each Character in String is : " + words[i] + " = " + count);
            }
        }
    }
}