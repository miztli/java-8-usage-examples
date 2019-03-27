package com.java8.examples.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by miztli on 10/04/17.
 */
public class ListExamples {
    public static void main(String[] args) {

        //Lambdas and functional interfaces
        ListExamples examples = new ListExamples();

        //arguments
        examples.arguments();

        //member and local
        examples.memberAndLocalVariables();

        //return value
        examples.compare();
    }

    /**
     * Please notice the type of argument e is being inferred by the compiler. Alternatively, you may explicitly provide the type of the parameter, wrapping the definition in brackets.
     */
    private void arguments(){
        Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
        Arrays.asList( "a", "b", "d" ).forEach( (String e) -> System.out.println( e ) );
    }

    /**
     * Lambdas may reference the class members and local variables (implicitly making them effectively final if they are not)
     */
    private void memberAndLocalVariables(){
        final String text = "Hello";
        Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( text + ": " + e ) );
    }

    /**
     * Lambdas may return a value. The type of the return value will be inferred by compiler. The return statement is not required if the lambda body is just a one-liner.
     */
    private void compare(){
        List<String> list = Arrays.asList( "Mariana", "Miztli", "Leticia", "Leonel" );
            //list.sort((e1, e2) -> e1.compareTo(e2));
            list.sort(Comparator.naturalOrder());
            list.forEach(e -> System.out.println(e));
    }
}
