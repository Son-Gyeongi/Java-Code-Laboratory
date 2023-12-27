package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 91));
    }
}

class Solution {
    public int solution(int a, int b) {

        String ab = "" + a + b;
        int intab = Integer.parseInt(ab);
        int multiab = 2 * a * b;

        return Math.max(intab, multiab);
    }
}