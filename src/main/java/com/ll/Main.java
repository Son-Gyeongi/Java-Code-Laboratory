package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] arr = {5, 9, 7, 10}; // 5
//        int[] arr = {3,2,6}; // 10
        int[] arr = {2, 36, 1, 3}; // 1
        System.out.println(Arrays.toString(s.solution(arr, 1)));
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        int[] filteredArr = Arrays.stream(arr)
                .filter(a -> a % divisor == 0)
                .toArray();

        if (filteredArr.length == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        return Arrays.stream(filteredArr).sorted().toArray();
    }
}