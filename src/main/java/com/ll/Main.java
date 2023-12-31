package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] box = {10, 8, 6}; // 가로, 세로, 높이
        System.out.println(s.solution(box, 3));
    }
}

class Solution {
    public int solution(int[] box, int n) {

        // 직육면체의 부피를 구하는 방법은 가로 X 세로 X 높이로 밑면의 넓이 X 높이
        return Arrays.stream(box).map(i -> i / n)
                .reduce(1, (i, acc) -> i * acc);
        /*
        가로가 10 이면 길이가 3인 주사위가 3개 들어간다.
        세로로 8이면 길이가 3인 주사위가 2개 들어간다.
        높이가 6이면 길이가 3인 주사위가 2개 들어간다.
        3 X 2 X 2 = 12 이다.
         */
    }
}