package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (i * j == n) {
                    answer += i;
                }
            }
        }

        return answer;
    }
}