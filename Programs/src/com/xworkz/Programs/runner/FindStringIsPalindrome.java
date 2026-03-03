package com.xworkz.Programs.runner;

public class FindStringIsPalindrome {
//    public static void main(String[] args) {
//        String name="wow";
//        String reverse=" ";
//        for (int i=name.length()-1;i>=0;i--){
//            reverse+= name.charAt(i);
//        }
//        if (name.equals(reverse)){
//            System.out.println("Palindrome : " + reverse + reverse.length() + name.length());
//        }else {
//            System.out.println("Not a Palindrome : " + reverse  + reverse.length() + name.length());
//        }
//    }
//}

public static void main(String[] args) {
    String name="madam";
    String reverse="";
    int i=name.length()-1;
    while (i>=0){
        reverse+=name.charAt(i);
        i--;
    }
    if(name.equals(reverse)){
        System.out.println("Palindrome : " + reverse + reverse.length() + name.length());
    }else {
        System.out.println("Not a Palindrome : " + reverse  + reverse.length() + name.length());
    }
}
}


