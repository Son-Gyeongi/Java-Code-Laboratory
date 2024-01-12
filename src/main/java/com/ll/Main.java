package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(s.solution(numbers, "left")));
    }
}

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            if (numbers.length - 1 >= 0) System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
            answer[0] = numbers[numbers.length - 1];
        } else {
            if (numbers.length - 1 >= 0) System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
            answer[answer.length - 1] = numbers[0];
        }

        return answer;
    }
}