package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcdevwxyz"));
    }
}

class Solution {
    public String solution(String myString) {
        return myString.replaceAll("[a-k]", "l");
    }
}