package com.xworkz.Programs.runner;

public class UniqueCharacters {
//        public static void main(String[] args) {
//
//            String str = "Java Automation";
//            str = str.toLowerCase();
//
//            System.out.println("Unique characters are:");
//
//            for (int i = 0; i < str.length(); i++) {
//                char current = str.charAt(i);
//                int count = 0;
//                for (int j = 0; j < str.length(); j++) {
//                    if (current == str.charAt(j)) {
//                        count++;
//                    }
//                }
//                if (count == 1) {
//                    System.out.print(current + " ");
//                }
//            }
//        }
//    }
//


    public static void main(String[] args) {
        String name = "Programming";
        name = name.toLowerCase();

        System.out.println("Unique Characters are : ");
        for (int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            int count=0;
            for (int j=0;j<name.length();j++){
                if (ch==name.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                System.out.print(ch + " ");
            }
        }
    }
}