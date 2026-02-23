package com.xworkz.Programs.runner;

public class SumOfDigits {
//    public static void main(String[] args) {
//        int number=12345;
//        int sum=0;
//        while (number>0){
//            int digit=number%10;
//            sum=sum+digit;
//            number=number/10;
//        }
//        System.out.println("Sum of Digits are : " + sum);
//    }


//    //Methods
//    public static void checkSumOfDigits(int num) {
//        int sum = 0;
//        while (num > 0) {
//            int digit = num % 10;
//            sum = sum + digit;
//            num = num / 10;
//        }
//        System.out.println("Sum of digits are : " + sum);
//    }
//
//    public static void main(String[] args) {
//        checkSumOfDigits(11);
//    }


    //Constructor
    public SumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of digits are : " + sum);
    }

    public static void main(String[] args) {
        SumOfDigits sumOfDigits=new SumOfDigits(77);
    }
}
