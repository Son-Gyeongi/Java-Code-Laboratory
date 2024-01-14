package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(29403));
    }
}

class Solution {
    public int solution(int order) {
        String[] split = String.valueOf(order).split("");

        return (int) Arrays.stream(split).mapToInt(Integer::parseInt)
                .filter(i -> i % 3 == 0 && i != 0)
                .count();
    }
}