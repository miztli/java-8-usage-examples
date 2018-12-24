package com.picnic;

public class MinimumOddInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = A[0];

        for (int number: A) {
            if(isOddNumber(number) && number<min) {
                min = number;
            }
        }

        return min;
    }

    boolean isOddNumber(int number) {
        return (number%2) != 0;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        MinimumOddInteger minimumOddInteger = new MinimumOddInteger();
        int min = minimumOddInteger.solution(arr);
        System.out.println("Min number in array: " + min);
    }

}
