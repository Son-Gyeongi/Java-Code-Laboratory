package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4,12));
    }
}

class Solution {
    public int solution(int slice, int n) {
        // slice : 사람 수, n : 조각 수
        return (n % slice == 0) ? n / slice : n / slice + 1;
    }
}