package com.flixbus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Voters {
    static String electionWinner(String[] votes) {
        Map<String, Integer> candidates = new HashMap<>(votes.length);

        for (String vote: votes) {
            if (candidates.containsKey(vote)) {
                candidates.put(vote, candidates.get(vote)+1);
            } else {
                candidates.put(vote, 1);
            }
        }

        int maxVotes = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry :  candidates.entrySet()) {
            String name = entry.getKey();
            Integer voteCount = entry.getValue();

            if(voteCount>maxVotes) {
                maxVotes=voteCount;
                winner=name;
            } else if (voteCount == maxVotes && winner.compareTo(name)<0) {
                winner = name;
            }
        }

        return winner;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int votesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] votes = new String[votesCount];

        for (int i = 0; i < votesCount; i++) {
            String votesItem = scanner.nextLine();
            votes[i] = votesItem;
        }

        String res = electionWinner(votes);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
