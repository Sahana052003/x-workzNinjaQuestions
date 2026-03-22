package com.xworkz.array.runner;

import java.util.HashMap;
import java.util.Map;

//Java program -input array was given[1,1,2,2,3,4,5,5,6,6],output-[3,4]
public class NonRepeatElement {
    public static void main(String[] args) {
//        int[] arr = {1,1,2,2,3,4,5,5,6,6};
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        // Count frequency
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        // Print elements with frequency = 1
//        System.out.print("Unique elements: ");
//        for (int key : map.keySet()) {
//            if (map.get(key) == 1) {
//                System.out.print(key + " ");
//            }
//        }




        int[] arr = {1,1,2,2,3,4,5,5,6,6};

        System.out.print("Non-Repeated elements: ");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
