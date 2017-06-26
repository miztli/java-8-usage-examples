package com.java8.examples;

import java.util.Scanner;

/**
 * Created by miztli on 21/06/17.
 */
public class Calls {
    public static void main(String[] args) {
        Scanner int_scanner = new Scanner(System.in);
        Scanner string_scanner = new Scanner(System.in);
        System.out.println("Give me the number of executives: ");
        int executives = int_scanner.nextInt();

        System.out.println("Give me the dataset size: ");
        int arrSize = int_scanner.nextInt();

        long dataset[][] = new long[arrSize][2];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("give me " + i + " value");
            String timestamps[] = string_scanner.nextLine().split(" ");
            dataset[i][0] = Long.valueOf(timestamps[0]);
            dataset[i][1] = Long.valueOf(timestamps[1]);
        }

        int overlaps = 0;
        for (int i = 0; i < dataset.length - 1; i++) {
            if (dataset[i + 1][0] >= dataset[i][0] && dataset[i + 1][0] <= dataset[i][1]) {
                overlaps++;
            }
        }
        if (overlaps == 0 && executives == 0 && dataset.length > 0) {
            System.out.printf("Missing: " + 1);
        } else if (overlaps > executives) {
            System.out.printf("Missing: " + (overlaps - executives));
        } else {
            System.out.println("Missing: " + 0);
        }
    }
}
