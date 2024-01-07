package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        // 다차원 배열 출력
        System.out.println(Arrays.deepToString(s.solution(3)));
    }
}

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) answer[i][j] = 1;
                else answer[i][j] = 0;
            }
        }

        return answer;
    }
}