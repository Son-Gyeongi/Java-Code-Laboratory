package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("cccCCC"));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        int[] array = my_string.chars().map(i -> 'a' <= i && i <= 'z' ? i - 32 : i + 32).toArray();
        // [67, 67, 67, 99, 99, 99]

        for (Integer number : array) {
            char character = (char) number.intValue();
            answer.append(character);
        }

        return answer.toString();
    }
}