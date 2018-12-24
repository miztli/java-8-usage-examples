package com.picnic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RecalculatePhoneBill {

    private static final Integer MORE_THAN_FIVE_MINUTES = 300;
    private static final Integer CENTS_PER_SECOND = 3;
    private static final Integer CENTS_PER_STARTED_MINUTE = 150;

    private static final Comparator<List<Call>> PHONE_CALL_LIST_COMPARATOR = (l1, l2) -> {
        Integer sumL1 = l1.stream()
                      .map(x -> x.totalSeconds)
                      .reduce(0, Integer::sum);

        Integer sumL2 = l2.stream()
                          .map(x -> x.totalSeconds)
                          .reduce(0, Integer::sum);

        int comparedValue = -1 * sumL1.compareTo(sumL2);
        return comparedValue == 0
                ? l1.stream().findFirst().get().phoneNumber.replace("-", "")
                .compareTo(l2.stream().findFirst().get().phoneNumber.replace("-", ""))
                : comparedValue;
    };

    public int solution(String S) {
        return Arrays.stream(S.split("\r?\n"))
                .map(x -> x.split(","))
                .map(Call::new)
                .collect(Collectors.groupingBy(x -> x.phoneNumber))
                .values()
                .stream()
                .sorted(PHONE_CALL_LIST_COMPARATOR)
                .skip(1) // skips first grouped ordered call
                .flatMap(List::stream) // removes external collection
                .mapToInt(call -> calculateBill(call))
                .reduce(0, Integer::sum);
    }

    private int calculateBill(Call call) {
        return call.totalSeconds >= MORE_THAN_FIVE_MINUTES
                ? ((call.hours * 60) + (call.minutes) + (call.seconds > 0 ? 1 : 0)) * CENTS_PER_STARTED_MINUTE
                : ((call.minutes * 60) + (call.seconds)) * CENTS_PER_SECOND;
    }

    private static class Call {
        final String phoneNumber;
        final int hours;
        final int minutes;
        final int seconds;
        final int totalSeconds;

        Call(String[] values) {
            phoneNumber = values[1];
            String[] durationArray = values[0].split(":");
            hours = Integer.valueOf(durationArray[0]);
            minutes = Integer.valueOf(durationArray[1]);
            seconds = Integer.valueOf(durationArray[2]);
            totalSeconds = (hours * 3600) + (minutes * 60) + (seconds);
        }
    }
    

    public static void main(String[] args) {
        RecalculatePhoneBill recalculatePhoneBill = new RecalculatePhoneBill();
        String logs = "00:01:07,400-234-090\n" +
                      "00:05:01,701-080-080\n" +
                      "00:05:00,400-234-090";

        int result = recalculatePhoneBill.solution(logs);
        System.out.println("Result: "+ result);
    }
}
