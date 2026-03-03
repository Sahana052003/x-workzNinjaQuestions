package com.xworkz.Programs.runner;

public class FindAllPermutations {
    public static void main(String[] args) {
        String name="abc";
        char[] chars=name.toCharArray();

        for (int i=0;i<chars.length;i++){
            for (int j=0;j< chars.length;j++){
                if(j==i)
                    continue;
                for (int k=0;k<chars.length;k++){
                    if(k==i || k==j)
                        continue;
                    System.out.println(""+chars[i]+chars[j]+chars[k]);
                }
            }
        }
    }
}


//    public static void main(String[] args) {
//        String str = "abc";
//        char[] chars = str.toCharArray();
//
//        int i = 0;
//        while (i < chars.length) {
//
//            int j = 0;
//            while (j < chars.length) {
//
//                if (j == i) {
//                    j++;
//                    continue;
//                }
//
//                int k = 0;
//                while (k < chars.length) {
//
//                    if (k == i || k == j) {
//                        k++;
//                        continue;
//                    }
//
//                    System.out.println("" + chars[i] + chars[j] + chars[k]);
//                    k++;
//                }
//                j++;
//            }
//            i++;
//        }
//    }
//}