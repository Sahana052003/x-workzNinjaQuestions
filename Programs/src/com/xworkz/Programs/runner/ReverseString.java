package com.xworkz.Programs.runner;


public class ReverseString {
////    public static void main(String[] args) {
////        String name="HELLO";
////        String reverse="";
////
////        for (int i=name.length()-1;i>=0;i--){
////            reverse=reverse+name.charAt(i);
////        }
////        System.out.println("REversed String is : " + reverse);
////    }
//
//
//
//
////    //Through array
////    public static void main(String[] args) {
////        String name="HELLO";
////        String reverse="";
////        char[] array=name.toCharArray();
////        int i=array.length-1;
////
////        while (i>=0){
////            reverse=reverse+array[i];
////            i--;
////        }
////        System.out.println("Reversed String is : " + reverse);
////
////}
//
//
////    //Using While-Loop
////
////    public static void main(String[] args) {
////        String name="Building";
////        String reverse="";
////        int i=name.length()-1;
////
////        while (i>=0){
////            reverse=reverse+name.charAt(i);
////            i--;
////        }
////        System.out.println("REversed String name is : " + reverse);
////    }
////
//
//
//
//
//
//
//
//
//    //Through Methods
//
////    public static void reversedName(String name){
////        String reverse="";
////        for (int i=name.length()-1;i>=0;i--){
////            reverse=reverse+name.charAt(i);
////        }
////        System.out.println("Reversed NAme is ; " + reverse);
////    }
////
////    public static void main(String[] args) {
////        reversedName("Laptop");
////    }
//
//
//
    //Through Constructor
    public ReverseString(String name){
        String reverse="";
        char[] array=name.toCharArray();

        for (int i=name.length()-1;i>=0;i--)
            reverse=reverse+array[i];
            System.out.println("Reversed string name is : " + reverse);
    }

    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString("Bottle");

    }
}


