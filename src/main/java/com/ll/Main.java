package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 1;

        if (n == 3628800) return 10;
        else if (362880 <= n && n < 3628800) return 9;
        else if (40320 <= n && n < 362880) return 8;
        else if (5040 <= n && n < 40320) return 7;
        else if (720 <= n && n < 5040) return 6;
        else if (120 <= n && n < 720) return 5;
        else if (24 <= n && n < 120) return 4;
        else if (6 <= n && n < 24) return 3;
        else if (2 <= n && n < 6) return 2;

        return answer;
    }
}