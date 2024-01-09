package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}; // 각각 연산한 결과
        System.out.println(s.solution(numLog));
    }
}

class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numLog.length - 1; i++) {
            int num = numLog[i + 1] - numLog[i];

            switch (num) {
                case 1:
                    answer.append("w");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
            }
        }

        return answer.toString();
    }
}