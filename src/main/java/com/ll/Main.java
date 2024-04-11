package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int unknown = n - 1;

        for (int i = 2; i <= n; i++) {
            if (unknown % i == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}