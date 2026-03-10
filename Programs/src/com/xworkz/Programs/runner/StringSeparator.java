package com.xworkz.Programs.runner;


//Java Program to gives two output: "Subburaj" ,"123" for the input String str="Subbu123raj"

public class StringSeparator {
    public static void main(String[] args) {
        String str = "Subbu123raj";
        String letters = "";
        String digits = "";
        int i = 0;

//        while (i<str.length()){
//            char ch=str.charAt(i);
//            if(ch>='0'&&ch<='9')
//                digits=digits+ch;
//            else
//                letters=letters+ch;
//            i++;
//        }
//        System.out.println("Letters are : " + letters);
//        System.out.println("Digits are : " + digits);
//    }
//}


        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                digits = digits + ch;
            else
                letters = letters + ch;
        }
        System.out.println("Letteres are : " + letters);
        System.out.println("Digits are : " + digits);
    }
}
