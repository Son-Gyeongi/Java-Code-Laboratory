package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {199, 72, 222};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] sides) {
        // 배열 정렬
        int[] sidesSort = Arrays.stream(sides).sorted().toArray();

        return sidesSort[2] < sidesSort[1] + sidesSort[0] ? 1 : 2;
    }
}