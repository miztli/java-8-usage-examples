package com.java8.examples.collections;

import java.util.Arrays;

public class ReduceDemos {
    private static int[] NUMBERS = {1,3,5,7};

    void reduceWithAccumulator(){
        System.out.println("---Reducing with accumulator---");
        Arrays.stream(NUMBERS)
              .reduce(Integer::sum)
              .ifPresent(System.out::println);
    }

    /**
     *
     */
    void reduceWithIdentityAndAccumulator(){
        System.out.println("---Reducing with accumulator and identity---");
        int result = Arrays.stream(NUMBERS)
                .reduce(0, Integer::sum);
        System.out.println(result);
    }

    /**
     * Here we will pass three arguments identity,
     * accumulator and combiner in reduce() method.
     * The identity value must be an identity for the combiner function.
     * This method with three arguments is used in parallel processing.
     * Combiner works with parallel stream only,
     * otherwise there is nothing to combine.
     */
    void reduceWithIdentityAccumulatorAndCombiner(){
        System.out.println("---Reducing with accumulator, identity and combiner---");
        int result = Arrays.asList(1,2,3,4,5,6)
                           .parallelStream()
                           .reduce(0, Integer::sum, Integer::sum);
        System.out.println(result);
    }

    public static void main(String[] args) {
        ReduceDemos reduceDemos = new ReduceDemos();
        reduceDemos.reduceWithAccumulator();
        reduceDemos.reduceWithIdentityAndAccumulator();
        reduceDemos.reduceWithIdentityAccumulatorAndCombiner();
    }
}
