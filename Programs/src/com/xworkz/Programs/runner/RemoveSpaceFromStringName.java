package com.xworkz.Programs.runner;


//Java Program to remove space from a given string


public class RemoveSpaceFromStringName {
    public static void main(String[] args) {
        String str = "Welcome to java program";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }
        System.out.println("String without spaces: " + result);
    }
}
