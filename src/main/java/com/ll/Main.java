package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(34,3));
    }
}

class Solution {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}