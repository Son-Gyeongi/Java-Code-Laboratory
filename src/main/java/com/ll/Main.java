package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        // n이 홀수면 홀수 숫자만, 짝수면 짝수 숫자만
        // 거르고 나서 반복해서 로직 수행

        for (int i = (n % 2 == 0) ? 0 : 1; i <= n; i=i+2) {
            if (n % 2 == 1) { // 홀수
                answer += i;
            } else {
                answer += (int) Math.pow(i, 2);
            }
        }

        return answer;
    }
}