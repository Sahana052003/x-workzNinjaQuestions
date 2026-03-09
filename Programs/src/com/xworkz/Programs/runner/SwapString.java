package com.xworkz.Programs.runner;


//Java Program to swap two string without using 3rd variable


public class SwapString {
//    public static void main(String[] args) {
//        String name="hello";
//        String name1="world";
//
//        System.out.println("Before swapping : ");
//        System.out.println("Name : " + name);
//        System.out.println("Name 1 : " + name1);
//        name=name+name1;
//        name1=name.substring(0,name.length()-name1.length());
//        name=name.substring(name1.length());
//
//        System.out.println("After Swapping : ");
//        System.out.println("Name : " + name);
//        System.out.println("Name 1 : " + name1);
//    }
//}


    public static void main(String[] args) {
        String a = "HELLO";
        String b = "WORLD";
        System.out.println("Before Swapping : ");
        System.out.println("NAme : " + a);
        System.out.println("NAme 1 : " + b);
        a = a + b;
        b=a.replace(b,"");
        a=a.replace(b,"");
        System.out.println("After Swapping");
        System.out.println("Name : " + a);
        System.out.println("Name 1 : " + b);
    }
}