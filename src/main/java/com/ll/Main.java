package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(s.solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer;
        int max = numbers[0] * numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) break; // 같은 인덱스는 거른다.
                answer = numbers[i] * numbers[j];
                max = Math.max(max, answer);  // 최대값
            }
        }

        return max;
    }
}