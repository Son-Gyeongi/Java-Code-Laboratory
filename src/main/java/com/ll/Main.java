package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        System.out.println(Arrays.toString(s.solution(intStrs, 50000, 5, 5)));
    }
}

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .map(str -> str.substring(s, s + l))
                .mapToInt(Integer::parseInt)
                .filter(i -> k < i)
                .toArray();
    }
}