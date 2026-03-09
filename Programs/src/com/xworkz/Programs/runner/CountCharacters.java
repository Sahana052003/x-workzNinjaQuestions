package com.xworkz.Programs.runner;

//Java program to gives output : a2b2c3d2 for the Input String str="aabbcccdd"


public class CountCharacters {
//    public static void main(String[] args) {
//
//        String str = "aabbcccdd";
//        int count = 1;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.charAt(i) == str.charAt(i + 1)) {
//                count++;
//            }
//            else {
//                System.out.print(str.charAt(i) + "" + count);
//                count = 1;
//            }
//        }
//        // print last character count
//        System.out.print(str.charAt(str.length() - 1) + "" + count);
//    }
//}


public static void main(String[] args) {

    String str = "aabbcccdd";
    int i = 0;

    while (i < str.length()) {

        char current = str.charAt(i);
        int count = 0;

        while (i < str.length() && str.charAt(i) == current) {
            count++;
            i++;
        }

        System.out.print(current + "" + count);
    }
}
}