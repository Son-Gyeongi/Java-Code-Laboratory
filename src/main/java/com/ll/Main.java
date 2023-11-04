package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(56));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7; // 피자 일곱 조각
        int mok = 0; // 나눈 나머지값

        /*
        1~7 / 1
        8~14 / 2
        15~ 21 /3
         */
        while (mok < 1) {
            mok = pizza/n;
            answer++;
            pizza += 7;
        }

        return answer;
    }
}