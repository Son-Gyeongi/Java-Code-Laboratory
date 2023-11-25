package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1, 2, 3, 4,5};
        System.out.println(Arrays.toString(s.solution(arr1, 27)));
    }
}

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1) {
                    answer[i] = arr[i] + n;
                } else answer[i] = arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else answer[i] = arr[i];
            }
        }

        return answer;
    }
}