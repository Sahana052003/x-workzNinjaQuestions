package com.xworkz.array.runner;

public class CommonElements {
//   public static void main(String[] args){
//      int[] arr1={1,2,3,4,5};
//      int[] arr2={4,5,6,7,8};
//
//      System.out.println("Common Elements are : ");
//      for(int i=0;i<arr1.length;i++){
//         for (int j=0;j<arr2.length;j++){
//            if(arr1[i]==arr2[j]){
//               System.out.print(arr1[i]+ " ");
//            }
//         }
//      }
//   }
//}


    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={3,4,5,6,7};

        int i=0;
        System.out.println("Common elements are : ");
        while (i<arr1.length){
            int j=0;
            while (j<arr2.length){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
                j++;
            }
            i++;
        }
    }
}