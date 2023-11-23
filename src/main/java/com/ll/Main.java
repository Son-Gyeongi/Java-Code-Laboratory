package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {12, 4, 15, 46, 38, -2, 15};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] num_list) {

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }
}