package com.ll;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(118372));
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] splitStr = String.valueOf(n).split("");

        for (int i = 0; i < splitStr.length; i++) {
            for (int j = i + 1; j < splitStr.length; j++) {
                if (Long.parseLong(splitStr[i]) < Long.parseLong(splitStr[j])) {
                    String temp = splitStr[i];
                    splitStr[i] = splitStr[j];
                    splitStr[j] = temp;
                }
            }
        }

        String collectStr = String.join("", splitStr);

        return Long.parseLong(collectStr);
    }
}