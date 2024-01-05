package com.ll;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 1, 1, 1, 0};
        System.out.println(s.solution(arr, 3));
    }
}

class Solution {
    public int solution(int[] arr, int idx) {
        return IntStream.range(0, arr.length)
                .filter(i -> idx <= i)
                .filter(i -> arr[i] == 1)
                .findFirst()
                .orElse(-1);
    }
}