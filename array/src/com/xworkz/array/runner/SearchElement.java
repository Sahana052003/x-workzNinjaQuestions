package com.xworkz.array.runner;


//search element in an array
public class SearchElement {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

        public static void main(String[] args){
            int[] arr = {5,2,9,1,6,3};
            int target = 6;

            int index = linearSearch(arr, target);

            if (index != -1)
                System.out.println("Found at index: " + index);
            else
                System.out.println("Element not found");
        }
}
