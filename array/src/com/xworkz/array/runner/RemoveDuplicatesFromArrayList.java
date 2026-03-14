package com.xworkz.array.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Java Program to remove duplicates from an arraylist


public class RemoveDuplicatesFromArrayList {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(2);
//        arrayList.add(9);
//        arrayList.add(1);
//        arrayList.add(6);
//        arrayList.add(2);
//        arrayList.add(5);
//
//        ArrayList<Integer> uniqueList = removeDuplicates(arrayList);
//
//        System.out.println("ArrayList with duplicates removed:");
//        for (int num : uniqueList) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
//        Set<Integer> set = new HashSet<>(list);
//        return new ArrayList<>(set);
//    }
//}
//
public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(5);

    ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
        if (!unique.contains(list.get(i))) {
            unique.add(list.get(i));
        }
    }

        System.out.println("Original : " + list);
        System.out.println("Unique   : " + unique);
}
}