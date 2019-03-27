package com.java8.examples.interfaces;

import java.util.Arrays;

/**
 *
 */
public class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("method 1 called!");
    }

    /**
     * Override is needed because both interfaces
     * have a default method with the same signature
     * @param name
     */
    @Override
    public void log(String name) {
        Interface1.print(name);
    }

/*    @Override
    public void method2() {

    }
    */

    public static void main(String[] args) {
        MyClass example = new MyClass();
            example.method1();
            example.log("miztli");
            example.printElements(Arrays.asList("Miztli", "Eduardo", "Melgoza"));
    }
}
