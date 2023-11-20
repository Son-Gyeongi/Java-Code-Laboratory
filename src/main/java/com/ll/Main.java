package com.ll;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 3, 4, 5};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        // 배열 길이 11이상이면 더하기, 배열 길이 10이하이면 곱하기
        if (num_list.length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer =1;
            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }
}