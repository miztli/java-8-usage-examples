package com.java8.examples.certification;

/**
 * Created by miztli on 14/06/17.
 */
public class Operators {
    public static void order(){
        System.out.println("----------------Order of operations--------------");
        int y=4;
        double x = 3+2*--y;
//        double x = 3+2*y--; //Does not work properly
        System.out.println("sum: " + x);
    }

    public static void module() {
        System.out.println("----------------Module operations--------------");
        System.out.println("Positive:");
        System.out.println("12%3=" + 12%3);
        System.out.println("12/3=" + 12/3);
        System.out.println("3%6=" + 3%6);
        System.out.println("3/6=" + (double)3/6);
    }

    public static void promotion() {
        System.out.println("----------------Numeric promotion--------------");
        int a = 3;
        float b = 12.00f;
        float c = b/a;
        System.out.println("12.00f/3= " + c);

        short d = 1;
        byte e = 1;
        int f = d+e;
        System.out.println("1+1= " + f);

        short g = 10;
        short h = 3;
        int i = g/h;
        double j = (double) g/h;
        System.out.println("10/3= " + i);
        System.out.println("10/3= " + j);
    }

    public static void main(String[] args) {
        Operators.order();
        Operators.module();
        Operators.promotion();
    }
}
