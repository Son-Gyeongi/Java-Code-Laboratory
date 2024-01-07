package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[][] arr = {{5, 192, 33},
//                {192, 72, 95},
//                {33, 95, 999}};
        int[][] arr = {{19, 498, 258, 587},
                {63, 93, 7, 754},
                {258, 7, 1000, 723},
                {587, 754, 723, 81}};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[][] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) return 0;
            }
        }

        return answer;
    }
}