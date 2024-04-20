package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcde"));
    }
}

class Solution {
    public String solution(String s) {
        return s.substring((s.length() - 1) / 2, (s.length() / 2) + 1);
    }
}