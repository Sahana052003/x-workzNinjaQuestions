package com.xworkz.Programs.runner;

//Java Program to gives output : "00003241212" for the input String str="32400121200"
public class MoveZerosToFirst {
    public static void main(String[] args) {
        String str = "32400121200";
        String nonZeros = "";
        String zeros = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0')
                zeros = zeros + c;
            else
                nonZeros = nonZeros + c;
        }

        System.out.println( zeros + nonZeros);
    }
}
