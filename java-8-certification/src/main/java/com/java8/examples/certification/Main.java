package com.java8.examples.certification;

import com.java8.examples.certification.Cat;

/**
 * Created by miztli on 3/06/17.
 */
public class Main {
    public static void main(String args[]){
        Cat cat = new Cat("chacho");
        Cat.Dog dog = new Cat.Dog("chuleta");
        Cat.Dog dog2 = new Cat.Dog();

        System.out.println(dog.getName());
        System.out.println(dog2.getName());
    }
}
