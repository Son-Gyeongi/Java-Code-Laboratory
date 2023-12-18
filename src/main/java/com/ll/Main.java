package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] str_list = {"abc", "def", "ghi"};
        System.out.println(s.solution("aBcDeFg"));
        // 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열
    }
}

class Solution {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}