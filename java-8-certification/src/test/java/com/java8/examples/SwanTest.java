package com.java8.examples;

import com.java8.examples.access_modifiers.Swan;

/**
 * Created by miztli on 4/06/17.
 */
public class SwanTest {
    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.numberOfEgg = 3;

        System.out.println("Number of eggs: " + swan.numberOfEgg);
    }


}
