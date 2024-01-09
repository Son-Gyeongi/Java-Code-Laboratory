package com.ll;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = {"a", "b", "c"};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public String solution(String[] arr) {
//        return Arrays.stream(arr).collect(Collectors.joining());
        return String.join("", arr);
    }
}