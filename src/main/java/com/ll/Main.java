package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("PrOgRaMmErS"));
    }
}

class Solution {
    public String solution(String myString) {
        // toLowerCase() : 대문자를 소문자로 바꿔준다.
        return myString.toLowerCase().replaceAll("a", "A");
    }
}