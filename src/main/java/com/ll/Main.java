package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("onetwothreefourfivesixseveneightnine"));
    }
}

class Solution {
    public long solution(String numbers) {
        String[] numberArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (String s : numberArr) {
            int index = Arrays.asList(numberArr).indexOf(s);
            // replace() 사용할 때 따로 저장 해야 하는 구나
            numbers = numbers.replace(s, String.valueOf(index));
        }

        return Long.parseLong(numbers);
    }
}