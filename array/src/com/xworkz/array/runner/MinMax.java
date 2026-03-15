package com.xworkz.array.runner;


import java.util.Arrays;

//Find the largest and smallest element in an array
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,6,3};

//        int smallest = arr[0];
//        int largest  = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest)  largest  = arr[i];
//            if (arr[i] < smallest) smallest = arr[i];
//        }
//
//        System.out.println("Largest:  " + largest);
//        System.out.println("Smallest: " + smallest);


        Arrays.sort(arr);

        int smallest = arr[0];
        int largest  = arr[arr.length - 1];

        System.out.println("Largest:  " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
