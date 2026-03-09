package com.xworkz.Programs.runner;


//Java program to print each letter twice from a given string



public class PrintLettersTwice {
//    public static void main(String[] args) {
//
//        String str = "hello";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char ch = str.charAt(i);
//
//            System.out.print(ch+""+ch);
//           // System.out.print(ch);
//        }
//    }
//}


    public static void main(String[] args) {
        String name = "hello";
        int i = 0;
        while (i < name.length()) {
            char ch = name.charAt(i);
            System.out.print(ch);
            System.out.print(ch);
            i++;
        }
    }
    }
