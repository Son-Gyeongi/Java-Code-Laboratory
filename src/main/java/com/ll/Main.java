package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {12, 4, 15, 1, 14};
        System.out.println(s.solution(num_list));
    }
}

class Solution {
    public int solution(int[] num_list) {
        int count = 0;

        for (int num : num_list) {
            int n = num;
            while (n > 1) {
                if (n % 2 == 0) n /= 2;
                else n = (n - 1) / 2;
                count++;
            }
        }

        return count;
    }
}