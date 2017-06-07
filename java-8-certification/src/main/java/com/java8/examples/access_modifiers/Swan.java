package com.java8.examples.access_modifiers;

/**
 * Created by miztli on 4/06/17.
 */
public class Swan {
//    protected int numberOfEgg;

    //Instance initializer
//    {System.out.println("Initializing a new Swan with default number of eggs: " + numberOfEgg);} //DOES NOT COMPILE
    public int numberOfEgg = 1; //defaults to 1
    //Instance initializer
    {
        System.out.println("Initializing a new Swan with default number of eggs: " + numberOfEgg);
    }
    public Swan(){
    }

    //Instance initializer
    {
        System.out.println("Initializing a new Swan");
    }
}
