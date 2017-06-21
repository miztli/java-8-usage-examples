package com.java8.examples.certification;

import com.java8.examples.certification.Cat;

/**
 * Created by miztli on 3/06/17.
 */
public class MainClass {
//    public static void main(String args[]){
//    public static void main(String[] names){
//    public static void main(String _Names[]){
//    public static void main(String... $n){
//    public static void main(String args){ //does not compile, requires array
//    public static final main(String args){ //does not compile
    public static void test(String[] args){ //does not run from command line
        System.out.println("one arg: " + args);
        Cat cat = new Cat("chacho");
        Cat.Dog dog = new Cat.Dog("chuleta");
        Cat.Dog dog2 = new Cat.Dog();

        System.out.println(dog.getName());
        System.out.println(dog2.getName());
    }
}
