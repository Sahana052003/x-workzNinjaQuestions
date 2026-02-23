package com.xworkz.Programs.runner;

public class FindNumberofDigits {
    public static void main(String[] args) {
        int num = 15345;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);



        FindNumberofDigits fnd=new FindNumberofDigits(23453456);



        fnd.findDigits(1234567);

    }


    public FindNumberofDigits(int num){
        int original = num;
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Number of Digits : " + count);
    }



    public static void findDigits(int num){
        int original = num;
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Number of Digits : " + count);
    }
}
