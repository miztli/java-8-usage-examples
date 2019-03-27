package com.java8.examples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class GroupBy {

    public void groupMapById() {
        Map<String, String> user1 = new HashMap<>();
        user1.put("id","1");
        user1.put("nombre","Miztli");
        user1.put("apellido","Melgoza");
        Map<String, String> user2 = new HashMap<>();
        user2.put("id","2");
        user2.put("nombre","Mariana");
        user2.put("apellido","Melgoza");
        Map<String, String> user3 = new HashMap<>();
        user3.put("id","3");
        user3.put("nombre","Eduardo");
        user3.put("apellido","Hernandez");
        Map<String, String> user4 = new HashMap<>();
        user4.put("id","1");
        user4.put("nombre","Miztli");
        user4.put("apellido","Melgoza");

        List<Map<String, String>> users = new ArrayList<>();
            users.add(user1);
            users.add(user2);
            users.add(user3);
            users.add(user4);

        Map<String, List<Map<String, String>>> groupedUsers =
                users.stream().collect(Collectors.groupingBy(u -> u.get("id")));

        printMap(groupedUsers);
    }

    private static void printMap(Map<String, List<Map<String, String>>> result) {
        result.forEach((key, value) -> {
            System.out.println("key: " + key);
            value.forEach(user -> {
                System.out.println("id: " + user.get("id"));
                System.out.println("nombre: " + user.get("nombre"));
                System.out.println("apellido: " + user.get("apellido"));
            });
        });
    }

    public static void main(String[] args) {
        GroupBy example = new GroupBy();
        example.groupMapById();
    }
}
