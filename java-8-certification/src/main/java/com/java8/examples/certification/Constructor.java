package com.java8.examples.certification;

/**
 * Created by miztli on 14/06/17.
 */
public class Constructor {
    public int a;

    public Constructor(){
        a=5;
    }

    public void Constructor(){
        a=4;
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println("a: " + constructor.a);

        constructor.Constructor();
        System.out.println("a: " + constructor.a);
    }

}
