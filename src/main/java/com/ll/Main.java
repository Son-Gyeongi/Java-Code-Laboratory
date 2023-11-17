package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ProgrammerS123", 11));
    }
}

class Solution {
    public String solution(String my_string, int n) {
        // 문자열의 시작은 0부터 ~ n-1까지 출력이 된다.
        return my_string.substring(0, n);
    }
}