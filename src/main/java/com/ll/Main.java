package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] str_list = {"abc", "def", "ghi"};
        System.out.println(s.solution(str_list, "ef"));
        // 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열
    }
}

class Solution {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                .filter(str -> !str.contains(ex)) // ex가 포함되지 않는 문자열을 찾는다.
                .reduce("", (acc, str) -> acc + str);
        // "" : 초기값, acc : 누적값, str : filter에서 넘어오는 각 요소
    }
}