package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(121));
    }
}

class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);

        if (n != Math.pow(sqrt, 2)) return -1;

        return (long) Math.pow(sqrt + 1, 2);
    }
}