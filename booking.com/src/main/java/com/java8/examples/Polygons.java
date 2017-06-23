package com.java8.examples;

import java.util.Scanner;

/**
 * Created by miztli on 21/06/17.
 */
public class Polygons {
    public static void main(String[] args) {
        Scanner string_scanner = new Scanner(System.in);

        int size = 6;
        int rectangles = 0;
        int squares = 0;
        int other = 0;
        for (int i = 0; i < size; i++) {
            String sides[] = string_scanner.nextLine().split(" ");
            long sideValues[] = new long[4];
            sideValues[0] = Long.valueOf(sides[0]);
            sideValues[1] = Long.valueOf(sides[1]);
            sideValues[2] = Long.valueOf(sides[2]);
            sideValues[3] = Long.valueOf(sides[3]);
            if((sideValues[0] == sideValues[1]) && (sideValues[0] == sideValues[2]) && (sideValues[0] == sideValues[3])){
                squares++;
            }else if((sideValues[0] == sideValues[2]) && (sideValues[1] == sideValues[3]) && (sideValues[0] != sideValues[1])){
                rectangles++;
            }else{
                other++;
            }
        }
        System.out.println(squares + " " + rectangles + " " + other);
    }
}
