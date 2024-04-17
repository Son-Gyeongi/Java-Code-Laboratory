package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 3));
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                answer += i;
            }
        }

        return answer;
    }
}