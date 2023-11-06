package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6; // 피자 조각

        while (true) {
            answer = pizza / n >= 0 ? ++answer : answer;
            if (pizza % n == 0) break;
            pizza += 6;
        }

        return answer;
    }
}