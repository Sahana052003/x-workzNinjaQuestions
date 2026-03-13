package com.xworkz.array.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
//    public static void main(String[] args) {
//        int[] arr={5,2,9,1,6,2,5};
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < result.size(); j++) {
//                if (arr[i] == result.get(j)) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                result.add(arr[i]);
//            }
//        }


//    public static void main(String[] args) {
//        int[] arr = {5,2,9,1,6,2,5};
//        Arrays.sort(arr);
//
//        int[] temp = new int[arr.length];
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0 || arr[i] != arr[i - 1]) {
//                temp[count] = arr[i];
//                count++;
//            }
//        }
//
//        int[] unique = Arrays.copyOf(temp, count);
//
//        for (int i = 0; i < unique.length; i++) {
//            System.out.print(unique[i] + " ");
//        }
//    }
//}


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        // Step 1: Sort the array
        // {1, 2, 2, 3, 4, 4, 5} → duplicates come next to each other
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 2: Print only if current != previous
        System.out.print(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(" " + arr[i]);
            }
        }
    }
}