package com.ll;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("12345"));
    }
}

class Solution {
    public int solution(String num_str) {
        return Stream.of(num_str.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}