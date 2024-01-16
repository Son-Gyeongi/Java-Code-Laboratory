package com.ll;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Bcad"));
    }
}

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")) // 문자열을 한 글자씩 분리하여 Stream으로 변환
                .map(str -> str.toLowerCase()) // 각 문자를 소문자로 변환
                .sorted().collect(Collectors.joining());
        // 문자를 정렬
        // 정렬된 문자를 하나의 문자열로 결합
    }
}