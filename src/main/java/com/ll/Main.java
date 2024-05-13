package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        System.out.println(Arrays.toString(s.solution(arr, queries)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int j = 0;

        for (int[] query : queries) {
            int[] temp = Arrays.copyOfRange(arr, query[0], query[1] + 1);

            int min = 1_000_001;

            for (int i = 0; i < temp.length; i++) {
                if (query[2] < temp[i]) {
                    min = Math.min(min, temp[i]);
                }
            }
            answer[j] = min == 1_000_001 ? -1 : min;
            j++;
        }

        return answer;
    }
}