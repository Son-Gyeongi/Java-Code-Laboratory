package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int a : s.solution(arr)) {
            System.out.println(a);
        }
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[]{0,0};

        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}