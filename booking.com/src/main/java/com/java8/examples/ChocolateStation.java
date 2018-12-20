package com.java8.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChocolateStation {

    List<TestCase> testCases;

    static class TestCase {
        private int arraySize;
        private String stations;
        private int cost;

        public TestCase(int arraySize, String stations, int cost) {
            this.arraySize = arraySize;
            this.stations = stations;
            this.cost = cost;
        }
    }

    public ChocolateStation() {
        this.testCases = new ArrayList<>();
    }

    public void addTestCase(TestCase testCase) {
        this.testCases.add(testCase);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type test cases:");
        int testCases = scanner.nextInt();
        scanner.nextLine();
        ChocolateStation chocolateStation = new ChocolateStation();

        for (int i = 0; i < testCases; i++) {
            System.out.println("Type array size:");
            int arraySize = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Type stations:");
            String stations = scanner.nextLine();

            System.out.println("Type cost:");
            int cost = scanner.nextInt();
            scanner.nextLine();
            ChocolateStation.TestCase testCase = new ChocolateStation.TestCase(arraySize, stations, cost);

            chocolateStation.addTestCase(testCase);
        }
        chocolateStation.printTestCases();

        chocolateStation.processCases();
    }

    private void processCases() {
        this.testCases.forEach(testCase -> {
            String[] stationNumbers = testCase.stations.split(" ");
            int chocolatesBought = stationNumbers.length > 0 ? Integer.parseInt(stationNumbers[0]) : 0;
            int chocolatesBalance = 0;

            for (int i = 0; i < stationNumbers.length-1; i++) {
                int chocolatesInStation = Integer.parseInt(stationNumbers[i]);
                int chocolatesInNextStation = Integer.parseInt(stationNumbers[i+1]);

                int result = chocolatesInStation - chocolatesInNextStation;
                if (result < 0) {
                    if (chocolatesBalance + result < 0){
                        chocolatesBought += -1 * (chocolatesBalance + result);
                        chocolatesBalance = 0;
                    } else {
                        chocolatesBalance += result;
                    }
                } else {
                    chocolatesBalance += result;
                }
            }
            System.out.println("Test case result: " + chocolatesBought*testCase.cost);
        });
    }

    public void printTestCases() {
        this.testCases.forEach(testCase -> {
            System.out.println("Array size: " + testCase.arraySize);
            System.out.println("Stations: " + testCase.stations);
            System.out.println("Cost: " + testCase.cost);
        });
    }
}
