package com.ll;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 3, 4, 5};
        System.out.println(Arrays.toString(s.solution("i love you")));
    }
}

class Solution {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}