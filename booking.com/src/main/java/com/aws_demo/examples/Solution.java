package com.aws_demo.examples;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
        // WRITE YOUR CODE HERE
        int[] previousStates = new int[states.length];
        int[] actualStates = new int[states.length];
        int countDays = 1;

        System.arraycopy(states, 0, actualStates, 0, states.length);

        do {
            System.arraycopy(actualStates, 0, previousStates, 0, actualStates.length);
            actualStates[0] = isActive(0, previousStates[1]);
            actualStates[previousStates.length-1] = isActive(0, previousStates[1]);

            for(int i=1; i<=previousStates.length-2; i++) {
                actualStates[i] = isActive(previousStates[i-1], previousStates[i+1]);
            }

            countDays++;
        } while (countDays == days);


        printArray(actualStates);
        return Arrays.stream(actualStates).boxed().collect(Collectors.toList());
    }
    // METHOD SIGNATURE ENDS

    int isActive(int left, int right) {
        return left == right ? 0 : 1;
    }

    public void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] states = new int[]{1,1,1,0,1,1,1,1};
        solution.cellCompete(states,2);
    }
}