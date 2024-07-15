package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] section = {2, 3, 6};
        int[] section = {1, 2, 3, 4};
        System.out.println(s.solution(4, 1, section));
    }
}

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n];

        // 이해. n이 학교 벽 길이이고 다시 칠해야하는 구간이 section이고 m 길이만큼 연달아 칠할 수 있다.

        // 1. section에서 칠해진 부분 false로 바꾸기
        for (int i=0;i<wall.length;i++) {
            for (int j=0;j<section.length;j++) {
                // i+1 이유 : 칠해지는 벽은 1부터
                if (i+1 == section[j]) wall[i] = true;
            }
        }

        System.out.println(Arrays.toString(wall));

        //  2. wall 배열에서 true인 것을 찾아서 m 길이만큼 false 해주기 그리고 다음 true를 찾고 반복
        for (int i=0;i<wall.length;i++) {
            if (wall[i]) {
                int mLength = Math.min(i + m, wall.length);
                for (int j=i;j<mLength;j++) {
                    // mLength : j가 wall의 길이를 넘어서는 순간 반복문 빠져나오기

                    wall[j] = false;
                }

                answer++; // 칠하는 횟수
            }
        }

        System.out.println(Arrays.toString(wall));

        return answer;
    }
}