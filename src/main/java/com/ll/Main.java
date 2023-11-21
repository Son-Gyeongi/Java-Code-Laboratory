package com.ll;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 3, 4, 5};
        System.out.println(s.solution(2,4));
    }
}

class Solution {
    public int solution(int a, int b) {
        boolean _a = (a % 2 == 1); // 홀수 true, 짝수 false
        boolean _b = (b % 2 == 1);

        if (_a && _b) return a*a + b*b;
        else if (_a || _b) return 2 * (a + b);
        else return Math.abs(a - b);
    }
}