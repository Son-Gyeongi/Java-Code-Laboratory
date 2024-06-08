package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Progra21Sremm3", 6, 12));
    }
}

class Solution {
    public String solution(String my_string, int s, int e) {
        String a = my_string.substring(0, s); // 0부터 s-1까지

        String b = my_string.substring(s, e + 1); // s부터 e까지
        StringBuilder sb = new StringBuilder(b);
        String reverse = sb.reverse().toString();

        String c = my_string.substring(e+1); // e+1 부터 끝까지

        return a + reverse + c;
    }
}