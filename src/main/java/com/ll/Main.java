package com.ll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcabcadc"));
        System.out.println(s.solution("abdc"));
        System.out.println(s.solution("hello"));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        Map<String, Integer> map = new HashMap<>();

        for (String string : str) {
            // 값이 있으면
            if (map.containsKey(string)) {
                Integer count = map.get(string);
                map.put(string, ++count);
            } else {
                // 값이 없으면
                map.put(string, 1);
            }
        }

        for (String string : str) {
            Integer count = map.get(string);

            if (count == 1) {
                answer += string;
            }
        }

        // answer 영어 오름차순으로 정렬
        String[] strSplit = answer.split("");
        Arrays.sort(strSplit);

        return String.join("", strSplit);
    }
}