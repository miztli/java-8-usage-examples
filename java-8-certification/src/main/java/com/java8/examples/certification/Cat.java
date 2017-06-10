package com.java8.examples.certification;

/**
 * Created by miztli on 3/06/17.
 */
public class Cat {
    String name;
    Paw paw;


    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Paw getPaw() {
        return paw;
    }

    public void setPaw(Paw paw) {
        this.paw = paw;
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

    public static void main(String[] args) {
        Paw paw = new Paw();
            paw.setNails(5);

        Cat cat = new Cat("chacho");
            cat.setPaw(paw);

        System.out.printf("Nails in the paw of " + cat.getName() + ": " +cat.getPaw().getNails());
    }
}

class Paw{
    private int nails;

    public Paw(){}

    public void setNails(int nails){
        this.nails = nails;
    }

    public int getNails() {
        return nails;
    }
}

