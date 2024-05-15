package com.ll;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] sides = {1, 2};
//        int[] sides = {3, 6};
//        int[] sides = {11, 7};
        int[] sides = {1000, 1000};
        System.out.println(s.solution(sides));
    }
}

class Solution {
    public int solution(int[] sides) {
        Set<Integer> set = new HashSet<>();

        // sides 배열 중에서 가장 긴 변일 경우
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for (int i=1;i<=max;i++){
            if ((max - min) < i) {
                set.add(i);
            }
        }

        // N 미지수가 가장 긴 변일 경우
        int sum = sides[0] + sides[1];

        for (int i=1;i<sum;i++){
            if (max < i) {
                set.add(i);
            }
        }

        return set.size();
    }
}