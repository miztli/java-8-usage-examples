package com.java8.examples.certification;

/**
 * Created by miztli on 4/06/17.
 */
public class StaticInitialization {
//    protected int numberOfEgg;

    //Instance initializer
//    {System.out.println("Initializing a new StaticInitialization with default number of eggs: " + numberOfEgg);} //DOES NOT COMPILE
    public int numberOfEgg = 1; //defaults to 1
    //Instance initializer
    {
        System.out.println("Initializing a new StaticInitialization with default number of eggs: " + numberOfEgg);
    }
    public StaticInitialization(){
        System.out.println("In constructor: " + numberOfEgg);
    }

    //Instance initializer
    {
        System.out.println("Initializing a new StaticInitialization");
    }

    public static void main(String[] args) {
        StaticInitialization staticInitialization = new StaticInitialization();
    }
}
