package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(23)); // cd
    }
}

class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        // a는 0, b는 1, c는 2, ..., j는 9
        String str = age + "";

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0' : answer.append("a"); break;
                case '1' : answer.append("b"); break;
                case '2' : answer.append("c"); break;
                case '3' : answer.append("d"); break;
                case '4' : answer.append("e"); break;
                case '5' : answer.append("f"); break;
                case '6' : answer.append("g"); break;
                case '7' : answer.append("h"); break;
                case '8' : answer.append("i"); break;
                case '9' : answer.append("j"); break;
            }
        }

        return answer.toString();
    }
}