package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(15, 5)));
    }
}

class Solution {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(num -> num % k == 0).toArray();
    }
}