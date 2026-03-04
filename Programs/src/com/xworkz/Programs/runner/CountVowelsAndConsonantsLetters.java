package com.xworkz.Programs.runner;

public class CountVowelsAndConsonantsLetters {
//    public static void main(String[] args) {
//        String name="Hello World";
//        name=name.toLowerCase();
//
//        int vowels=0, consonants=0;
//
//        for (int i=0;i<name.length();i++){
//            char ch=name.charAt(i);
//
//            if(ch>='a'&&ch<='z'){
//                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//                    vowels++;
//                    System.out.println("Vowels are : " + ch + " ");
//                    System.out.println("=================");
//
//                }else{
//                    System.out.println("Consonants are : " + ch + " ");
//                        consonants++;
//                }
//            }
//        }
//        System.out.println("Vowels are : " + vowels );
//        System.out.println("Consonants are : " + consonants);
//    }
//}

    public static void main(String[] args) {
        String name = "JAVA PROGRAMMING";
        name = name.toLowerCase();
        int vowels = 0, consonants = 0;

        int i = 0;
        while (i < name.length()) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            i++;
        }
        System.out.println("Vowels are : " + vowels);
        System.out.println("Consonants are : " + consonants);
    }
}
