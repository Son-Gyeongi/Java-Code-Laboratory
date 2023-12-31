package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
        System.out.println(Arrays.toString(s.solution(strArr)));
    }
}

class Solution {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }
}