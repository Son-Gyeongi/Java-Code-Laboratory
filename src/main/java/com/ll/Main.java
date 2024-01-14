package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("78720646226947352489"));
    }
}

class Solution {
    public int solution(String number) {
        String[] split = number.split("");
        int sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();

        return sum % 9;
    }
}