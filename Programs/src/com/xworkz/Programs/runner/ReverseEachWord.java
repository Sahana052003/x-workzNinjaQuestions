package com.xworkz.Programs.runner;

public class ReverseEachWord {
//    public static void main(String[] args) {
//        String input = "Hello World from Java";
//        String result = reverseEachWord(input);
//        System.out.println("Original String: " + input);
//        System.out.println("Reversed Words: " + result);
//    }
//
//    public static String reverseEachWord(String str) {
//        String[] words = str.split(" ");
//        String reversedString = "";
//
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            String reversedWord = "";
//
//            for (int j = word.length() - 1; j >= 0; j--) {
//                reversedWord += word.charAt(j);
//            }
//
//            reversedString += reversedWord + " ";
//        }
//
//        return reversedString.trim();
//    }
//}


    public static void main(String[] args) {
        String input = "Java is good programming language";
        String result = reverseEachWord(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + result);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        int i = 0;

        while (i < words.length) {
            String word = words[i];
            String reversedWord = "";
            int j = word.length() - 1;

            while (j >= 0) {
                reversedWord += word.charAt(j);
                j--;
            }

            reversedString += reversedWord + " ";
            i++;
        }

        return reversedString.trim();
    }
}