package com.ll;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 3, 4, 5};
        System.out.println(s.solution(69.42));
    }
}

class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}