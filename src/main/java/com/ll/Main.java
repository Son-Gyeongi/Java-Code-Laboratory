package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1, 2, 3, 4,5};
        System.out.println(Arrays.toString(s.solution(3, 10)));
    }
}

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        int j = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[j] = i;
            ++j;
        }

        return answer;
    }
}