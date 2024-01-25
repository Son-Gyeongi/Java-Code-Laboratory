package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(true, false, false, false));
    }
}

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;

        if ((x1 || x2) && (x3 || x4)) return true;

        return answer;
    }
}