package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {4, 2, 6, 1, 7, 6};
        System.out.println(s.solution(num_list));
    }
}

class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            // 배열 인덱스가 0,2,4.. -> 홀수 번째로 나오기
            if (i % 2 == 0) odd += num_list[i];
            else even += num_list[i];
        }

        return Math.max(odd, even);
    }
}