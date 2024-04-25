package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        System.out.println(s.solution(order));
    }
}

class Solution {
    public int solution(String[] order) {
        // 아메리카노 4,500원 / 카페라테 5,000원
        // 차가운 지 따뜻한 지 구별 안해도 됨
        // "anything"인 '아무거나'는 아메리카노

        int americanoCount = (int) Arrays.stream(order)
                .filter(o1 -> o1.contains("americano") || o1.contains("anything"))
                .count();

        int cafelatteCount = (int) Arrays.stream(order)
                .filter(o2 -> o2.contains("cafelatte"))
                .count();

        return (americanoCount * 4500) + (cafelatteCount * 5000);
    }
}