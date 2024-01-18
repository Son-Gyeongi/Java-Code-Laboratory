package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean[] included = {true, false, false, true, true};
        System.out.println(s.solution(3,4, included));
    }
}

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int cnt = 0;

        for (int i = a; cnt < included.length; i += d) {
            if (included[cnt]) answer += i;
            ++cnt;
        }

        return answer;
    }
}