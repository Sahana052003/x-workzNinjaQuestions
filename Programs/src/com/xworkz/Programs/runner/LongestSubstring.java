package com.xworkz.Programs.runner;//package com.xworkz.Programs.runner;
//
//(Time Complexity -> O(n)^2
//public class LongestSubstring {
//    public static void main(String[] args) {
//        String s1 = "abcabcbb";
//        String s2 = "bbbbb";
//        String s3 = "pwwkew";
//        String s4 = "";
//
//        System.out.println("Longest substring : " + longestSubstring(s1));
//        System.out.println("Longest substring : " + longestSubstring(s2));
//        System.out.println("Longest substring : " + longestSubstring(s3));
//        System.out.println("Longest substring : " + longestSubstring(s4));
//    }
//
//    public static int longestSubstring(String s) {
//        int maxLength = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            String current = "";
//            for (int j = i; j < s.length(); j++) {
//                char c = s.charAt(j);
//                boolean found = false;
//
//                // check if character already exists in current
//                for (int k = 0; k < current.length(); k++) {
//                    if (current.charAt(k) == c) {
//                        found = true;
//                        break;
//                    }
//                }
//                if (found)
//                    break;
//                current = current + c;
//
//                // update maxLength manually
//                if (current.length() > maxLength)
//                    maxLength = current.length();
//            }
//        }
//        return maxLength;
//    }
//}














//(Time Complexity -> O(n)
//public class LongestSubstring {
//    public static void main(String[] args) {
//        String s1 = "abcabcbb";
//        String s2 = "bbbbb";
//        String s3 = "pwwkew";
//        String s4 = "";
//
//        System.out.println("Longest substring : " + longestSubstring(s1));
//        System.out.println("Longest substring : " + longestSubstring(s2));
//        System.out.println("Longest substring : " + longestSubstring(s3));
//        System.out.println("Longest substring : " + longestSubstring(s4));
//    }
//
//    public static int longestSubstring(String s) {
//        int start = 0;
//        int end = 0;
//        int maxLength = 0;
//        String window = "";
//
//        while (end < s.length()) {
//            char c = s.charAt(end);
//
//            // check if c already exists in window
//            int pos = window.indexOf(c);
//
//            if (pos == -1) {
//                // character not found, expand window
//                window = window + c;
//                end++;
//                if (window.length() > maxLength)
//                    maxLength = window.length();
//            } else {
//                // character found, shrink window from left
//                window = window.substring(pos + 1);
//                start = start + pos + 1;
//            }
//        }
//        return maxLength;
//    }
//}











public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
        System.out.println(longestSubstring("bbbbb"));
        System.out.println(longestSubstring("pwwkew"));
        System.out.println(longestSubstring(""));
    }

    public static int longestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            // move start forward until no duplicate
            for (int i = start; i < end; i++) {
                if (s.charAt(i) == c) {
                    start = i + 1;
                    break;
                }
            }
            // window size = end - start + 1
            if (end - start + 1 > maxLength)
                maxLength = end - start + 1;
        }
        return maxLength;
    }
}
