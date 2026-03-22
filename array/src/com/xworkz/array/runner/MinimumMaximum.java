package com.xworkz.array.runner;


//Find Minimum amd maximum  from an array
public class MinimumMaximum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value : " + max);
    }
}
