package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(345000));
    }
}

class Solution {
    public int solution(int price) {

        // 10만 원 이상 사면 5% 할인
        // 30만 원 이상 사면 10% 할인
        // 50만 원 이상 사면 20% 할인
        if (price >= 500000) {
            price = (int) (price * 0.8);
        } else if (price >= 300000) {
            price = (int) (price * 0.9);
        } else if (price >= 100000) {
            price = (int) (price * 0.95);
        }

        return price;
    }
}