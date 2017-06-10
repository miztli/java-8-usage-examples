package com.java8.examples.certification;

/**
 * Created by miztli on 9/06/17.
 */
public class VariableInitialization {
    public static void localVariables(){
        int a;
//        System.out.println("Value of a: " + a); //Invalid, local variables must be initialized
        a = 1;
        System.out.printf("Value of a: " + a);
    }

    public static void findAnswer(boolean check){
        int answer;
        int onlyOneBranch;
        if(check){
            answer=1;
            onlyOneBranch=2;
        }else{
            answer=0;
        }
        System.out.println("Value of answer: " + answer);
//        System.out.println("Value of onlyOneBranch: " + onlyOneBranch); //DOES NOT COMPILE
    }

    public static void main(String[] args) {
        localVariables();
    }
}
