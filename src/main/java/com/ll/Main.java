package com.ll;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 1, "qjnwezgrpirldywt"));
    }
}

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        String[] splitCode = code.split("");

        int firstIdx = IntStream.range(0, splitCode.length)
                .filter(idx -> idx % q == r)
                .findFirst()
                .getAsInt();

        for (int i = firstIdx; i < splitCode.length; i += q) {
            answer.append(splitCode[i]);
        }

        return answer.toString();
    }
}