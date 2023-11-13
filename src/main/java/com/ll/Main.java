package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aAb1B2cC34oOp"));
    }
}

class Solution {
    public int solution(String my_string) {
        String tmp = my_string.replaceAll("[A-Z, a-z]", ""); // "1234"

        int answer = tmp.chars()
                .map(Character::getNumericValue)
                .sum();

        return answer;
    }
}