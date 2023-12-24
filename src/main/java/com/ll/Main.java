package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(s.solution(arr, 3)));
    }
}

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(i -> k % 2 == 1 ? i * k : i + k).toArray();
    }
}