package com.ll;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("wrong", "wrogn"));
    }
}

class Solution {
    public int solution(String before, String after) {
        String beforeStr = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String afterStr = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());

        return beforeStr.equals(afterStr) ? 1 : 0;
    }
}