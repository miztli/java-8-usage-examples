package com.aws_demo.examples;

public class GCD {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        // the GCD of a number with itself is... itself
        int gcd = arr[0];

        // compute incrementally
        for( int i=1; i<arr.length; i++ ) {
            gcd = getGCD( gcd, arr[i] );
        }
        // return result
        return gcd;
    }

    public int getGCD(int a, int b) {
        if (b == 0) { return a; }
        else { return getGCD(b, a%b); }
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int[] numbers = new int[]{2,4,6,8,10};
        int greatest = gcd.generalizedGCD(5, numbers);
        System.out.println("greatest: " + greatest);
    }
}
