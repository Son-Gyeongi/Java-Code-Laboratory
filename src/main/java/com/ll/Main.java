package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        System.out.println(s.solution(lines));
    }
}

import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        // lines[][0]를 확인해서 순서대로 정렬하기
        Arrays.sort(lines, (a, b) -> Integer.compare(a[0], b[0]));

        // 2개 좌표 중 시작점의 큰 수, 끝점의 작은 수
        for (int i=0;i<lines.length-1;i++) {
            int start = 0;
            int end = 0;
            for (int j=i+1;j<lines.length;j++) {
                // 안 겹치는 좌표 필터
                if ((lines[i][0] < lines[j][0]) && (lines[i][1] < lines[j][0])) continue;

                start = lines[i][0] > lines[j][0] ? lines[i][0] : lines[j][0];
                end = lines[i][1] > lines[j][1] ? lines[j][1] : lines[i][1];

                answer += Math.abs(end-start);

                // 중복되는 구간 검색에서 제외
                int tmp = lines[i][1];
                lines[i][1] = lines[j][0];
                lines[j][0] = tmp;

                // [7, 5] 경우 위치 바꾸기 [5, 7]로
                if (lines[j][0] > lines[j][1]) {
                    int temp = lines[j][1];
                    lines[j][1] = lines[j][0];
                    lines[j][0] = temp;
                }
            }
        }

        return answer;
    }
}