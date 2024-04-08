package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(s.solution(emergency)));
    }
}

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] >= emergency[j]) {
                    answer[j] += 1;
                }
            }
        }

        return answer;
    }
}