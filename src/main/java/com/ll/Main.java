package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1, 2, 3, 4,5};
        System.out.println(s.solution(-4, -7, true));
    }
}

class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}