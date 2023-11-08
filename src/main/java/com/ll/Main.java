package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"com", "b", "d", "p", "c"};
        System.out.println(s.solution(arr1, arr2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}