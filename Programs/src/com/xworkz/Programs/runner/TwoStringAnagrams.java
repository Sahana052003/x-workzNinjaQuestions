package com.xworkz.Programs.runner;

import java.util.Arrays;

public class TwoStringAnagrams {
//        public static void main(String[] args) {
//
//            String str1 = "listen";
//            String str2 = "silent";
//
//
//            if (str1.length() != str2.length()) {
//                System.out.println("Not Anagram");
//                return;
//            }
//
//            char[] arr1 = str1.toCharArray();
//            char[] arr2 = str2.toCharArray();
//
//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
//
//            if (Arrays.equals(arr1, arr2))
//                System.out.println("Anagram" );
//            else
//                System.out.println("Not Anagram");
//        }
//    }
//


    public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";

    // Convert to lowercase
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
        System.out.println("Not Anagrams");
        return;
    }

    int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
        count[str1.charAt(i) - 'a']++;
        count[str2.charAt(i) - 'a']--;
    }

    boolean isAnagram = true;
        for (int i = 0; i < count.length; i++) {
        if (count[i] != 0) {
            isAnagram = false;
            break;
        }
    }

        if (isAnagram)
            System.out.println("Anagrams");
        else
                System.out.println("Not Anagrams");
}
}