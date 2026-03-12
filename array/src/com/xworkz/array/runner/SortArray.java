package com.xworkz.array.runner;


//Sort an array without using in-built method

public class SortArray {
    public static void main(String[] args) {
        int[] arr={5,2,9,1,6};

        System.out.println("Before Sorting Array : ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting array : ");
        for (int i: arr){
            System.out.print(i+ " ");
        }

    }
}
