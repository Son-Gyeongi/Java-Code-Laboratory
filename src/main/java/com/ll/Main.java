package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello",3));
    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}