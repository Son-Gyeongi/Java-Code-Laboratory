package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("dxccxbbbxaaaa")));
    }
}

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(i -> !i.isEmpty())
                .sorted().toArray(String[]::new);
    }
}