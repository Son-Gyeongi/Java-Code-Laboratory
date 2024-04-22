package com.ll;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {7, 77, 17};
        System.out.println(s.solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String[] splitStr = String.valueOf(array[i]).split("");

            for (int j = 0; j < splitStr.length; j++) {
                if (Objects.equals(splitStr[j], "7")) {
                    answer++;
                }
            }
        }

        return answer;
    }
}