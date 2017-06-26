package com.java8.examples;

import java.util.*;

/**
 * Created by miztli on 19/06/17.
 */
public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Lines:");
//        int n = sc.nextInt();
//        for(int t = 0; t < n; t++) {
//            System.out.println("Give me a");
//            int a = sc.nextInt();
//            System.out.println("Give me b");
//            int b = sc.nextInt();
//            System.out.println("a+b=" + (a+b));
//            System.out.println(a + b);
//        }
//    }

//    public static void main(String[] args) {
//        int arr[] = new int[3];
//            arr[0] = 1;
//            arr[1] = 2;
//            arr[2] = 3;
////            arr[3] = 4;
////            arr[4] = 5;
//
//        System.out.println(findNumber(arr, 5));
//        System.out.println(oddNumbers(1,5));
//    }

    static String findNumber(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
            return (k == arr[i]) ? "YES" :  "NO";
        }
        return "NO";
    }

    static int[] oddNumbers(int l, int r) {
        List<Integer> oddList = new ArrayList<>();
        for(int i = l; i<= r; i++){
            if ((i%2) != 0) oddList.add(i);
        }
        int arr[] = new int[oddList.size()];
        for (int i=0; i<oddList.size(); i++) {
            arr[i] = oddList.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> result = new HashMap<>();

        System.out.println("Search:");
        Scanner scText = new Scanner(System.in);
        String search = scText.nextLine();

        System.out.println("Number of reviews:");
        Scanner scNumber = new Scanner(System.in);
        int reviews = scNumber.nextInt();

        String[] arrSearch = search.split(" ");

        for (int i = 0; i<reviews; i++){
            System.out.println("Give me hotel id:");
            int hotelId = scNumber.nextInt();
            System.out.println("Give me review:");
            String[] textReview = scText.nextLine().split(" ");

            for(int j=0; j<textReview.length; j++){
                if(textReview[j].contains(",")){
                    textReview[j] = textReview[j].replace(",","");
                }
                if(textReview[j].contains(".")){
                    textReview[j] = textReview[j].replace(".","");
                }
                for (int k = 0; k < arrSearch.length; k++) {
                    if(arrSearch[k].equals(textReview[j])){
                        Integer times = result.getOrDefault(hotelId, 0);
                        times++;
                        result.put(hotelId, times);
                    }
                }

            }
        }

        int maxVal=0;
        int maxKey=0;
        do{
            for (Integer key : result.keySet()) {
                if(result.get(key)>maxVal){
                    maxKey = key;
                    maxVal = result.get(key);
                }
            }

            System.out.print(maxKey + " ");
            result.remove(maxKey);
            maxKey=0;
            maxVal=0;
        }while(result.size()>0);


    }





}
