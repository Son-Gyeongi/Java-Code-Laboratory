package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("banana", "ana"));
    }
}

class Solution {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}