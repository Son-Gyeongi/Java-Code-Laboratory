package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "z";
        String skip = "abcdefghij";
        System.out.println(s.solution(str, skip, 20));
    }
}

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"}; // 26개
        String[] sArr = s.split("");
        String[] skipArr = skip.split("");

        // skip되는 알파벳 빼고 저장하기
        String[] keepAlphabet = new String[26 - skip.length()];
        int keepIdx = 0;
        for (int i=0;i<alphabet.length;i++) {
            boolean check = false; // skip 존재하는지 확인
            for (int j=0;j<skipArr.length;j++) {
                if (alphabet[i].equals(skipArr[j])) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                keepAlphabet[keepIdx++] = alphabet[i];
            }

            if (keepIdx == keepAlphabet.length) break;
        }

        System.out.println(Arrays.toString(keepAlphabet));

        for (int i=0;i<sArr.length;i++) {
            // 먼저 sArr 요소랑 맞는 keepAlphabet 인덱스 찾기
            int idx = 0;
            for (int j=0;j<keepAlphabet.length;j++) {
                if (sArr[i].equals(keepAlphabet[j])) {
                    idx = j;
                    break;
                }
            }

            int standard = (idx+index) % keepAlphabet.length;
            sArr[i] = keepAlphabet[standard];
        }

        return String.join("", sArr);
    }
}