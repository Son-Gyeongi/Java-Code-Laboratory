package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("m", "aabcc"));
    }
}

class Solution {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}