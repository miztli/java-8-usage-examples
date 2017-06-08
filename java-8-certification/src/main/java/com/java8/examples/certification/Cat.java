package com.java8.examples.certification;

/**
 * Created by miztli on 3/06/17.
 */
public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Dog{
        private String name;

        public Dog(){}
        public Dog(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }
}

