package com.xworkz.Programs.runner;

public class Palindrome {
//    public static void main(String[] args) {
//         int number=121;
//         int originalNumber=number;
//         int reverse=0;
//
//         while (number>0){
//             int digit=number%10;
//              reverse=reverse*10+digit;
//              number=number/10;
//         }
//         if(originalNumber==reverse){
//             System.out.println("Is Palindrome : " + originalNumber);
//         }else {
//             System.out.println("Not a Palindrome : " + originalNumber);
//         }
//
//


//    //Through Methods
//    public static void checkPalindrome(int num){
//         int originalNumber=num;
//         int reverse=0;
//
//         while (num>0){
//             int digit=num%10;
//              reverse=reverse*10+digit;
//              num=num/10;
//         }
//         if (originalNumber==reverse)
//             System.out.println("IS PAlindrome: " + originalNumber);
//         else
//             System.out.println("Not a Palindrome : " + originalNumber);
//    }
//
//    public static void main(String[] args) {
//        checkPalindrome(121);
//
//    }


    //Constructor
    public Palindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if (originalNumber == reverse)
            System.out.println("IS A Palindrome : " + originalNumber);
        else
            System.out.println("Not a Palindrome : " + originalNumber);
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome(1001);
    }
}