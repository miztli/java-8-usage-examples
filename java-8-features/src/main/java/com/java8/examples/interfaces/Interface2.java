package com.java8.examples.interfaces;

@FunctionalInterface
public interface Interface2 {

    //public void method2();
    void method1();

    default void log(String name) {
        System.out.println("logging from interface2: " + name);
    }
}
