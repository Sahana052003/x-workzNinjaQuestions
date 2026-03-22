package com.xworkz.array.runner;

//Java Program to count odd and even number from given array
//Input: {1,2,3,4,5,6,7,8,9}
public class OddEvenNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
