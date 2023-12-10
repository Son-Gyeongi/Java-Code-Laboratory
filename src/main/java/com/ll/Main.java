package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int numLastBefore = num_list[num_list.length - 2];
        int numLast = num_list[num_list.length - 1];

        int[] answer = Arrays.copyOfRange(num_list, 0, num_list.length+1);
        System.out.println(Arrays.toString(answer));
        answer[answer.length - 1] = numLast > numLastBefore ? numLast - numLastBefore : numLast * 2;

        return answer;
    }
}