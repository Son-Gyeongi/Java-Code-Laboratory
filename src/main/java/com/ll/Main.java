package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strArr = {"and", "notad", "abcd"};
        System.out.println(Arrays.toString(s.solution(strArr)));
    }
}

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(str -> !str.contains("ad"))
                .toArray(String[]::new);
    }
}