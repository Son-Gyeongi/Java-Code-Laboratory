package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        System.out.println(Arrays.toString(s.solution(num_list)));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] array = Arrays.stream(num_list).sorted().toArray();
        return Arrays.copyOfRange(array, 0, 5);
    }
}