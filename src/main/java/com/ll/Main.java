package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aaaaa", "bbbbb"));
    }
}

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += ("" + str1.charAt(i) + str2.charAt(i));
        }

        return answer;
    }
}