package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AAAAaaaa", "a"));
    }
}

class Solution {
    public String solution(String myString, String pat) {
        int strLastIdx = myString.lastIndexOf(pat) + pat.length();

        return myString.substring(0, strLastIdx);
    }
}