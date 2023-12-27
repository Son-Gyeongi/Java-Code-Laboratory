package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("programmers", "p"));
    }
}

class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}