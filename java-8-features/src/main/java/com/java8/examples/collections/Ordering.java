package com.java8.examples.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ordering {

    public static int ageComparator(User u1, User u2) {
        if (u1.getAge() > u2.getAge()) {
            return 1;
        }
        if (u1.getAge() < u2.getAge()) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        User user1 = new User("miztli", 28);
        User user2 = new User("mariana", 25);
        User user3 = new User("eduardo", 29);
        User user4 = new User("barbie", 24);
        User user5 = new User("leticia", 58);

        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        Comparator<User> comparator = (u1, u2) -> {
            if (u1.getAge() > u2.getAge()) {
                return 1;
            }
            if (u1.getAge() < u2.getAge()) {
                return -1;
            }
            return 0;
        };

        //users.sort(comparator);
        users.sort(Ordering::ageComparator);
        users.forEach(u -> System.out.println("usuario -> nombre: " + u.getName() + " edad: " + u.getAge()));
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
