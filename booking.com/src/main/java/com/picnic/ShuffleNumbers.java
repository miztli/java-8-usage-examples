package com.picnic;

public class ShuffleNumbers {
    public int solution(int A) {
        // write your code in Java SE 8
        String number = String.valueOf(A);
        int stringNumberLength = number.length();

        boolean isStringNumberLengthOdd = isOddNumber(stringNumberLength);
        int iterations = isStringNumberLengthOdd ?
                            (stringNumberLength-1)/2 :
                            stringNumberLength/2;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append(number.charAt(i));
            int charAt = stringNumberLength-(i+1);
            sb.append(number.charAt(stringNumberLength-(i+1)));
        }

        if(isStringNumberLengthOdd) {
            sb.append(number.charAt(iterations));
        }
        return Integer.parseInt(sb.toString());
    }

    boolean isOddNumber(int number) {
        return (number%2) != 0;
    }

    public static void main(String[] args) {
//        int number = 123456;
//        int number = 12345;
        int number = 130;
        ShuffleNumbers shuffleNumbers = new ShuffleNumbers();
        int result = shuffleNumbers.solution(number);
        System.out.println("shuffled: " + result);
    }
}
