package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1234));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += (n % 10);
            n = n / 10;
        }

        return answer;
    }
}