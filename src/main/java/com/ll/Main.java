package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(20));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;

        // 제곱근 구하기
        int result = (int) Math.sqrt(n);

        for (int i = 0; i <= result; i++) {
            for (int j = n; j > 0; j--) {
                if (i * j == n) {
                    cnt++;
                }
            }
        }
        answer = answer+(cnt*2);

        if (Math.pow(result, 2) == n) {
            answer--;
        }

        return answer;
    }
}