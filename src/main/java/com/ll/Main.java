package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("banana")));
    }
}

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }

        return Arrays.stream(answer).sorted().toArray(String[]::new);
    }
}