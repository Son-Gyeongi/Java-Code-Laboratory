package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aAb1B2cC34oOp"));
    }
}

class Solution {
    public int solution(String my_string) {
        String s = my_string.replaceAll("[a-zA-Z]", " ");

        return Arrays.stream(s.split(" "))
                .filter(i -> !i.isEmpty())
                .mapToInt(Integer::valueOf)
                .sum();
    }
}