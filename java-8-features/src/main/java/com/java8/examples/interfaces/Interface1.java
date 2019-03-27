package com.java8.examples.interfaces;

@FunctionalInterface
public interface Interface1 {

    void method1();

    static void print(String name) {
        System.out.println("printing from Interface1: " +  name);
    }

    default void log(String name) {
        System.out.println("logging from interface1: " + name);
    }

    default void printElements(Iterable<String> names) {
        names.forEach(System.out::println);
    }
}
