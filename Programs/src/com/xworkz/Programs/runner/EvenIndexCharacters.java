package com.xworkz.Programs.runner;


//java program to print even indexed characters

public class EvenIndexCharacters {
    public static void main(String[] args) {
        String name="Automation";
        System.out.println("Print Even Indexed Characters : ");
        for (int i=0;i<name.length();i++){
            if(i%2==0){
                System.out.print(name.charAt(i)+" ");
            }
        }
    }
}
