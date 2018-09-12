package com.java8.examples;

import java.util.Scanner;

public class HowManyX {

    private String[][] values;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa iteraciones: ");
        int times = scanner.nextInt();
        scanner.nextLine(); // consume line
        String[][] values = new String[times][2];
        for (int i = 0; i < times ; i++) {
            System.out.println("Ingresa numero a buscar:");
            values[i][0] = scanner.nextLine();
            System.out.println("Ingresa valor en " + i + ":");
            values[i][1] = scanner.nextLine();
        }
        HowManyX howManyX = new HowManyX(values);
        howManyX.countX();
    }

    public HowManyX(String[][] values) {
        this.values = values;
    }

    public void countX(){
        for (int i = 0; i < this.values.length; i++) {
            String[] numbers = this.values[i][1].split(" ");
            int search = Integer.parseInt(this.values[i][0]);
            int from = Integer.parseInt(numbers[0]);
            int to = Integer.parseInt(numbers[1]);
            int numberCount = 0;
            for (int j = from+1; j < to; j++) {
                numberCount += getRepeatCount(search, j);
            }
            System.out.println("search: " + search + " from: " + from + " to: " + to + " count: " + numberCount);
        }

    }

    private int getRepeatCount(int search, int number) {
        int repeated = 0;
        while (number != 0) {
            int digit = number%10;
            if (digit == search) repeated++;
            number = number/10;
        }
        return repeated;
    }
}
