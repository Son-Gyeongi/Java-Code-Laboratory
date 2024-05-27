package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(73));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i=1;i<=n;i++) {

            answer++;

            while (answer %3 == 0 && answer > 0) answer++;

            // 문자열로 3 포함하는지 보기
            String str = String.valueOf(answer);
            while(str.contains("3")) {
                answer++;
                str = String.valueOf(answer);
            }

            while (answer %3 == 0 && answer > 0) answer++;
            // System.out.printf("%d ==> %d\n", i, answer);
        }

        return answer;
    }
}