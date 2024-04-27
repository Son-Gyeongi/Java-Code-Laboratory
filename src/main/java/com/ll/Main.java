package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 12)));
//        System.out.println(Arrays.toString(s.solution(1_000_000, 999_999))); // 타입을 long으로
//        System.out.println(Arrays.toString(s.solution(1_000_000, 1_000_000)));
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int max = 0; // 최대공약수 저장
        int min; // 최소공배수 저장

        // n, m 작은 거 구하기 어차피 작은거 보다 큰 공약수 나올 수 없음
        int len = Math.min(n, m);

        for (int i = len; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                max = i;
                break;
            }
        }

        min = n * m / max;

        return new int[]{max, min};
    }
}