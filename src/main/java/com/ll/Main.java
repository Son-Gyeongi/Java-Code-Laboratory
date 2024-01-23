package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        System.out.println(Arrays.toString(s.solution(arr, queries)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;

        for (int[] query : queries) {
            temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }

        return arr;
    }
}