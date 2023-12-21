package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] intArr = {4, 2, 6, 1, 7, 6};
        System.out.println(Arrays.toString(s.solution(intArr, 4)));
    }
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];
        int j = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                answer[j] = num_list[i];
                j++;
            }
        }

        return answer;
    }
}