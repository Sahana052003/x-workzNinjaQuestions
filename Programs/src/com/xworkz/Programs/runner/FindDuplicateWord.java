package com.xworkz.Programs.runner;

public class FindDuplicateWord {
    public static void main(String[] args) {
        String name="learnjavaprogramming";
        char[] chars=name.toCharArray();
        System.out.println("Duplicates are : ");

        for (int i=0;i<chars.length;i++){
            int count=1;

            for (int j=i+1;j< chars.length;j++){
                if(chars[i]==chars[j]){
                    count++;
                    chars[j]='0';
                }
            }
            if(count>1&&chars[i]!='0'){
                System.out.println(chars[i] + ":" +count);
            }
        }
    }
}
