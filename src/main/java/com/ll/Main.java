package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(s.solution(arr, 2)));
        // 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열
    }
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-(n-1)];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n-1];
            n++;
        }

        return answer;
    }
}