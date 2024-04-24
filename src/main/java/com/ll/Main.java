package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Zbcdefg"));
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] split = s.split("");
        char[] charArray = s.toCharArray();

        for (int i = 122; i >= 97; i--) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == i) {
                    answer.append(split[j]);
                }
            }
        }

        for (int i = 90; i >= 65; i--) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == i) {
                    answer.append(split[j]);
                }
            }
        }

        return answer.toString();
    }
}