package com.xworkz.array.runner;

import java.util.ArrayList;
import java.util.List;


/// Find first and last element of Arraylist
///
///
public class FirstAndLastElement {
//    public static void main(String[] args) {
//        ArrayList<String> list=new ArrayList<>();
//        list.add("Hello");
//        list.add("What'sUP");
//        list.add("berry");
//        list.add("Nothing");
//        list.add("Bye");
//
//        String first= list.get(0);
//
//        String  last=  list.get(list.size()-1);
//
//        System.out.println("Array List : " + list);
//        System.out.println("First Element : " + first);
//        System.out.println("Last Element : " + last);
//    }
//}


//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("What'sUP");
//        list.add("berry");
//        list.add("Nothing");
//        list.add("Bye");
//
//        String first = null;
//        String last = null;
//
//        for (String element : list) {
//            if (first == null) {
//                first = element;
//            }
//            last = element;
//        }
//        System.out.println("Array List    : " + list);
//        System.out.println("First Element : " + first);
//        System.out.println("Last Element  : " + last);
//    }
//}
//


    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("What'sUP");
        list.add("berry");
        list.add("Nothing");
        list.add("Bye");

        Object[] array = list.toArray();
        String first= (String)array[0];
        String last=(String)array[array.length-1];

        System.out.println("Array List : " + list);
        System.out.println("First Element :  " + first);
        System.out.println("Last Element : "  + last);
    }
}
