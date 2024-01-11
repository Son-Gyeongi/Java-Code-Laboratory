package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};
        System.out.println(Arrays.toString(s.solution(arr, intervals)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        int[] ints = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] intArr = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        // 두 배열의 길이 합치기
        int[] answer = new int[ints.length + intArr.length];

        // 첫 번째 배열 복사
        System.arraycopy(ints, 0, answer, 0, ints.length);

        // 두 번째 배열 복사
        System.arraycopy(intArr, 0, answer, ints.length, intArr.length);

        return answer;
    }
}