package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("0010"));
    }
}

class Solution {
    public String solution(String n_str) {
        int numStr = Integer.parseInt(n_str);

        return String.valueOf(numStr);
    }
}