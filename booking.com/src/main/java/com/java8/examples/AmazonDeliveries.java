package com.java8.examples;

import java.util.*;

public class AmazonDeliveries {
    static class Delivery {
        private int number;
        private double result;
        private List<Integer> destination;

        public Delivery(int number, double result, List<Integer> destination) {
            this.number = number;
            this.result = result;
            this.destination = destination;
        }
    }
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries)
    {
        // WRITE YOUR CODE HERE
        List<Delivery> deliveries = new ArrayList<>(numDeliveries);
        for (int i = 0; i < numDestinations; i++) {
            List<Integer> destination = allLocations.get(i);
            double result = Math.sqrt(Math.pow(destination.get(0),2) + Math.pow(destination.get(1),2));
            deliveries.add(new AmazonDeliveries.Delivery(i, result, destination));
        }

        Collections.sort(deliveries, (o1, o2) -> o1.result >= o2.result ? 1 : -1);

        List<List<Integer>> resultList = new ArrayList<>(numDeliveries);
        for (int i = 0; i < numDeliveries; i++) {
            resultList.add(deliveries.get(i).destination);
        }

        return resultList;
    }
    // METHOD SIGNATURE ENDS


    public static void main(String[] args) {
        AmazonDeliveries amazonDeliveries = new AmazonDeliveries();
        List<List<Integer>> deliveries = new ArrayList<>();
        List<Integer> delivery1 = new ArrayList<>();
            delivery1.add(1);
            delivery1.add(2);
        List<Integer> delivery2 = new ArrayList<>();
            delivery2.add(3);
            delivery2.add(4);
        List<Integer> delivery3 = new ArrayList<>();
            delivery3.add(1);
            delivery3.add(-1);
        deliveries.add(delivery1);
        deliveries.add(delivery2);
        deliveries.add(delivery3);

        amazonDeliveries.ClosestXdestinations(deliveries.size(), deliveries, 2);
    }
}
