package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 4, 5, 2, 1};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) sb1.append(num_list[i]);
            else sb2.append(num_list[i]);
        }

        int a = Integer.parseInt(String.valueOf(sb1));
        int b = Integer.parseInt(String.valueOf(sb2));

        return a + b;
    }
}