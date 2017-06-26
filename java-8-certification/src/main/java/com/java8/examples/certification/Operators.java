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

<<<<<<< HEAD
    public static void logicalOperators(){
//        int x = !5; // DOES NOT COMPILE
//        boolean y = -true; // DOES NOT COMPILE
//        boolean z = !0; // DOES NOT COMPILE
        boolean d = !true;
        System.out.println("d: " + d);
    }

    public static void incrementDecrementOperators(){
        System.out.println("Increment and decrement operators");
=======
    public static void IncrementAndDecrement_1(){
>>>>>>> 27e608338cf238c07ada84216b6efc3cd66e00f2
        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
<<<<<<< HEAD
        System.out.println(counter++); // Outputs 1
        System.out.println(counter); // Outputs 2
        System.out.println(counter--); // Outputs 2
        System.out.println(counter); // Outputs 1
        System.out.println(--counter); // Outputs 0
        System.out.println(counter); // Outputs 0
    }
=======
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0
    }
    public static void IncrementAndDecrement_2(){
        int x=3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    public static void compoundAssignmentOperators() {
        int x = 3;
        int y = 2;
        int z = 1;
        z+=x;
        System.out.println("z: " + z);

        z = x=3;
        System.out.println("x: " + x);
        System.out.println("z: " + z);

        int a=3;
        double b =5.0;
        b *= a;
        a *= b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void logicalOperators() {
        boolean x = true;
        boolean y = false;
        if(x&y){
            System.out.println("X:"+x+" y:"+y);
        }

        boolean z = true ^ true;
        System.out.println("z=: " + z);

        Integer s=null;
        if(s != null && s < 5) {
// Do something
        }
        System.out.println("&& worked");
//        if(s != null & s < 5) { // Throws an exception if x is null
// Do something
//        }

        int d=6;
        boolean t = (d >= 6) || (++d <= 7);
        System.out.println("d: " + d);//Because x >= 6 is true , the increment operator on the right-hand side of the expression
//                                        is never evaluated, so the output is 6 .
    }

    public static void equalityOperators(){
//        boolean x = true == 3; // DOES NOT COMPILE
//        boolean y = false != "Giraffe"; // DOES NOT COMPILE
//        boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE

        Cat a = new Cat("chacho");
        Cat b = new Cat("chacho");
        System.out.println("a==b: " + (a==b));
    }
>>>>>>> 27e608338cf238c07ada84216b6efc3cd66e00f2

    public static void main(String[] args) {
        Operators.order();
        Operators.module();
        Operators.promotion();
<<<<<<< HEAD
        Operators.logicalOperators();
        Operators.incrementDecrementOperators();
=======
        Operators.IncrementAndDecrement_1();
        Operators.IncrementAndDecrement_2();
        Operators.compoundAssignmentOperators();
        Operators.logicalOperators();
        Operators.equalityOperators();
>>>>>>> 27e608338cf238c07ada84216b6efc3cd66e00f2
    }
}
