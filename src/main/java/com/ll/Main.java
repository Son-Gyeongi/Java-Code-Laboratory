package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(s.solution(dots));
    }
}

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        // 0,1,2,3 은 dots의 인덱스를 말함
        // 좌표 0,1 와 2,3 일 경우
        if ((dots[1][0] - dots[0][0] == dots[3][0] - dots[2][0])
                && (dots[1][1] - dots[0][1] == dots[3][1] - dots[2][1])) return 1;
        else if (((double)(dots[1][1] - dots[0][1])/(dots[1][0] - dots[0][0]))
                == ((double)(dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]))) return 1;

        // 좌표 0,2 와 1,3 일 경우
        if ((dots[2][0] - dots[0][0] == dots[3][0] - dots[1][0])
                && (dots[2][1] - dots[0][1] == dots[3][1] - dots[1][1])) return 1;
        else if (((double)(dots[2][1] - dots[0][1])/(dots[2][0] - dots[0][0]))
                == ((double)(dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]))) return 1;

        // 좌표 0,3 와 1,2 일 경우
        if ((dots[3][0] - dots[0][0] == dots[2][0] - dots[1][0])
                && (dots[3][1] - dots[0][1] == dots[2][1] - dots[1][1])) return 1;
        else if (((double)(dots[3][1] - dots[0][1])/(dots[3][0] - dots[0][0]))
                == ((double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]))) return 1;

        return answer;
    }
}