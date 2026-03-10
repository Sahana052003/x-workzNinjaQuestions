package com.xworkz.Programs.runner;

//Java Program to gives output "32412120000" for the input String str="32400121200"
public class MoveZeros {
    public static void main(String[] args) {
        String str = "32400121200";
        String nonZeros="";
        String zeros="";

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0')
                zeros=zeros+ch;
            else
                nonZeros=nonZeros+ch;
        }
        System.out.println(nonZeros+zeros);
        System.out.println("Zeros are : " + zeros);
        System.out.println("NonZeros are : " + nonZeros);
    }
}
