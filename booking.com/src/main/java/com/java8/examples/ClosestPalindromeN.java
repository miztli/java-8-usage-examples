package com.java8.examples;

import java.util.Scanner;

public class ClosestPalindromeN {

    public int[] numbers;
    private boolean incrementedIsPalindrome;

    public ClosestPalindromeN(int[] numbers) {
        this.numbers = numbers;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type times:");
        int times = scanner.nextInt();
        System.out.println("Times: " + times);
        int[] numbers = new int[times];
        for (int i = 0; i <times ; i++) {
            System.out.println("Give me number " + (i+1) + " :");
            numbers[i] = scanner.nextInt();
        }

        ClosestPalindromeN palindrome = new ClosestPalindromeN(numbers);
        palindrome.printNumbers(numbers);
        palindrome.findClosestPalindrome();
    }

    void printNumbers(int[] numbers) {
        System.out.println("Given numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    void findClosestPalindrome(){
        for (int i = 0; i < this.numbers.length; i++) {
            int number = this.numbers[i];

            int incremented = number;
            int decremented = number;
            boolean incrementedIsPalindrome;
            boolean decrementedIsPalindrome;

            if (isPalindrome(number)){
                System.out.println("For number: " + number + " -> " + number);
            } else {
                do {
                    incremented++;
                    decremented = decremented > 0 ? decremented-1 : decremented;
                    incrementedIsPalindrome = isPalindrome(incremented);
                    decrementedIsPalindrome = isPalindrome(decremented);
                } while (incrementedIsPalindrome!=true || decrementedIsPalindrome!=true);
                printResult(number, incremented, decremented, decrementedIsPalindrome);
            }
        }
    }

    private void printResult(int number,
                             int incremented,
                             int decremented,
                             boolean decrementedIsPalindrome) {
        if (decrementedIsPalindrome){
            System.out.println("For number: " + number + " -> " + decremented);
        } else {
            System.out.println("For number: " + number + " -> " + incremented);
        }
    }

    private boolean isPalindrome(int incremented) {
        return incremented == reverseNumber(incremented);
    }

    private int reverseNumber(int number){
        int reverse = 0;
        while(number != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        }
        return reverse;
    }

}
