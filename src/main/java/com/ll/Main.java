package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(10, 3)));
    }
}

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start;
            start = start - 1;
        }

        return answer;
    }
}