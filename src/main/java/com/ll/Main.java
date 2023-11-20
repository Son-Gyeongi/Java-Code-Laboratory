package com.ll;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aBcDeFg"));
    }
}

class Solution {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}