package com.ll;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AB", 1));
    }
}

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        String[] sArr = s.split("");

        String[] upperCase = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"
                ,"Q","R","S","T","U","V","W","X","Y","Z"};
        String[] lowerCase = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"
                ,"q","r","s","t","u","v","w","x","y","z"};

        for (String string : sArr) {
            if (Objects.equals(string, " ")) {
                answer.append(string);
                continue;
            }
            int idx;

            for (int j = 0; j < upperCase.length; j++) {
                // 대문자
                if (Objects.equals(string, upperCase[j])) {
                    idx = j + n;
                    if (idx >= 26) idx -= 26;
                    answer.append(upperCase[idx]);
                } else if (Objects.equals(string, lowerCase[j])) { // 소문자
                    idx = j + n;
                    if (idx >= 26) idx -= 26;
                    answer.append(lowerCase[idx]);
                }
            }
        }

        return answer.toString();
    }
}