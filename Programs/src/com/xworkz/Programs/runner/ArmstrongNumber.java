package com.xworkz.Programs.runner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Armstrong Number is : " + original);
        }else {
            System.out.println("Not a Armstrong NUmber : " + original);
        }

        ArmstrongNumber an=new ArmstrongNumber(123);

        ArmstrongNumber.armstNumber(153);



    }

    public ArmstrongNumber(int num){

        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Armstrong Number is : " + original);
        }else {
            System.out.println("Not a Armstrong NUmber : " + original);
        }

    }

    public static void armstNumber(int num){
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Armstrong Number is : " + original);
        }else {
            System.out.println("Not a Armstrong NUmber : " + original);
        }

    }
}
