package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello"));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == 'a'
                    | my_string.charAt(i) == 'e'
                    | my_string.charAt(i) == 'i'
                    | my_string.charAt(i) == 'o'
                    | my_string.charAt(i) == 'u') {
                continue;
            }
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }
}