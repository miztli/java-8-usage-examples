package com.java8.examples;

import com.java8.examples.access_modifiers.Cat;
import com.java8.examples.access_modifiers.Swan;

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
