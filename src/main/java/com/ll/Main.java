package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(s.solution(names)));
    }
}

class Solution {
    public String[] solution(String[] names) {
        return IntStream.range(0, names.length).filter(i -> i % 5 == 0)
                .mapToObj(i -> names[i])
                .toArray(String[]::new); // IntStream요소가 문자열 배열로 변경됨
    }
}