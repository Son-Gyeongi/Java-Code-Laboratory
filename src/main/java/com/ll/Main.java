package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        System.out.println(Arrays.toString(s.solution(arr, queries)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) arr[j] += 1;
            }
        }

        return arr;
    }
}