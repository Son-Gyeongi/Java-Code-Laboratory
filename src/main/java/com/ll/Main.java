package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("hi12392")));
    }
}

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[a-zA-Z]", "");
        String[] strArr = str.split("");

        return Arrays.stream(strArr).mapToInt(Integer::parseInt)
                .filter(i -> 0 <= i && i <= 9)
                .sorted()
                .toArray();
    }
}