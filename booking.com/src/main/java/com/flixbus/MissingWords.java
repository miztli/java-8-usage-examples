package com.flixbus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWords {

    public static List<String> missingWords(String s, String t) {
        // Write your code here
        List<String> sWords = Arrays.asList(s.split("\\s+"));
        List<String> tWords = Arrays.asList(t.split("\\s+"));

        List<String> missingWords = new ArrayList<>();

        for (String word : sWords) {
            if (!tWords.contains(word)) {
                missingWords.add(word);
            }
        }

        return missingWords;
    }

    public static void main(String[] args) {
        String a = "I am using HackerRank to improve programming";
        String b = "am HackerRank to improve";
        List<String> missing = missingWords(a, b);
        missing.forEach(word -> System.out.println("word: " + word));
    }
}
