package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7,15));
    }
}

class Solution {
    public int solution(int n, int t) {
        // 거듭 제곱
        return n * (int)Math.pow(2, t);
    }
}