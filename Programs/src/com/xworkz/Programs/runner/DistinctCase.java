package com.xworkz.Programs.runner;


import java.util.Arrays;

//java program to gives two output:"abcde",'ABCDE" for the input string str="aBACbcEDed"
public class DistinctCase {
//    public static void main(String[] args) {
//        String str="aBACbcEDed";
//        String lower="";
//        String upper="";
//
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(Character.isLetter(ch)){
//                if(Character.isLowerCase(ch)&& lower.indexOf(ch)==-1){
//                    lower+=ch;
//                }
//                if(Character.isUpperCase(ch)&&upper.indexOf(ch)==-1){
//                    upper+=ch;
//                }
//            }
//        }
//        System.out.println("Lower case letters : " + lower);
//        System.out.println("Upper case letters : " + upper);
//    }
//}

//        public static void main(String[] args) {
//            String str = "aBACbcEDed";
//            StringBuilder lower = new StringBuilder();
//            StringBuilder upper = new StringBuilder();
//
//            for (char c : str.toCharArray()) {
//                if (Character.isLowerCase(c)) lower.append(c);
//                else upper.append(c);
//            }
//
//            char[] lowerArr = lower.toString().toCharArray();
//            char[] upperArr = upper.toString().toCharArray();
//            Arrays.sort(lowerArr);
//            Arrays.sort(upperArr);
//
//            System.out.println("Lowercase: " + new String(lowerArr));
//            System.out.println("Uppercase: " + new String(upperArr));
//        }
//    }

        public static void main(String[] args) {
            String str = "aBACbcEDed";
            String lower = "";
            String upper = "";
            int i = 0;

            while (i < str.length()) {
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z')
                    lower = lower + c;
                else
                    upper = upper + c;
                i++;
            }

            System.out.println("Lowercase: " + lower);
            System.out.println("Uppercase: " + upper);
        }
}