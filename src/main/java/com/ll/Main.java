package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("masterpiece"));
    }
}

class Solution {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}