package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(s.solution(arr, 6));
    }
}

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for (int num : num_list) {
            if (num == n) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}