package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(24, 27));
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 약수가 홀수개
            if (Math.pow((int) Math.sqrt(i), 2) == i) {
                answer -= i;
                continue;
            }
            answer += i;
        }

        return answer;
    }
}