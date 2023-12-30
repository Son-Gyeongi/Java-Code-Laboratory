package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("dfjardstddetckdaccccdegk", 4));
    }
}

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        int index = code -1;
        int strLength = cipher.length() / code;

        for (int i = 0; i < strLength; i++) {
            answer.append(cipher.charAt(index));
            index += code;
        }

        return answer.toString();
    }
}