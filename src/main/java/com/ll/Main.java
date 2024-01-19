package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1},
                            {1, 2},
                            {2, 3}};
        System.out.println(Arrays.toString(s.solution(arr, queries)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (queries[i][0] <= j && j <= queries[i][1])
                    arr[j] += 1;
            }
        }

        return arr;
    }
}