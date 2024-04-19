package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(626331));
    }
}

class Solution {
    public int solution(long num) {
        int count = 0;

        if (num == 1) return 0;

        while (num != 1) {
            if (num % 2 ==0) num /= 2;
            else num = (num * 3) + 1;

            count++;
            if (count >= 500) return -1;
        }

        return count;
    }
}