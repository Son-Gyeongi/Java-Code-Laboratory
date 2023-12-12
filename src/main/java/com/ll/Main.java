package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {58, 44, 27, 10, 100};
        System.out.println(s.solution(arr, 139));
    }
}

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}