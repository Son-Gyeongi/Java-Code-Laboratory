package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5,6));
    }
}

class Solution {
    public int solution(int a, int b) {
        String aStr = "" + a;
        String bStr = "" + b;

        String str = Integer.parseInt(aStr + bStr) >= Integer.parseInt(bStr + aStr) ? aStr + bStr : bStr + aStr;

        return Integer.parseInt(str);
    }
}