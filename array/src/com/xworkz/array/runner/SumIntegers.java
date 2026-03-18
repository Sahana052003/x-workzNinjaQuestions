package com.xworkz.array.runner;


//“Array consists of integers and characters, sum only integers”
public class SumIntegers {
    public static void main(String[] args) {

        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};

        int sum = sumIntegers(array);

        System.out.println("Sum of integers in the array: " + sum);
    }

    public static int sumIntegers(String[] array) {
        int sum = 0;

        for (String element : array) {
            try {
                int num = Integer.parseInt(element); // convert string to int
                sum += num;
            } catch (NumberFormatException e) {
                // Ignore non-integer values like 'a', 'b'
            }
        }

        return sum;
    }
}
