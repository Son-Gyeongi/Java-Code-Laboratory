package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strArr = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] intArr = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(s.solution(strArr, intArr));
        // 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열
    }
}

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }
}