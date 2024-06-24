package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(4)));
    }
}

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int column = n; // 열 → 오른쪽 화살표 계산
        int row = n; // 행 ↓ 아래쪽 화살표 계산
        int firstColumn = 0; // 열 ← 왼쪽 화살표 계산
        int firstRow = 0; // 행 ↑ 위쪽 화살표 계산
        int count = 1;
        int x = 0; // answer[x][y]
        int y = 0;

        // right, left 결정
        boolean rlSwitch = true; // true일 경우 오른쪽으로 false일 경우 왼쪽으로
        // up, down 결정
        boolean udSwitch = true; // true일 경우 아래쪽으로 false일 경우 위쪽으로


        while(true) {
            if (rlSwitch) {
                // →
                for (int i=y;i<column;i++) {
                    answer[x][i] = count;
                    count++;
                    y = i;
                }
                x += 1;
                System.out.printf("x = %d, y = %d\n", x, y);
                rlSwitch = false;
                column--;
            }

            if (udSwitch) {
                // ↓
                for (int i=x;i<row;i++) {
                    answer[i][y] = count;
                    count++;
                    x = i;
                }
                y -= 1;
                System.out.printf("x = %d, y = %d\n", x, y);
                udSwitch = false;
                row--;
            }

            if (!rlSwitch) {
                // ←
                for (int i=y;i>=firstColumn;i--) {
                    answer[x][i] = count;
                    count++;
                    y = i;
                }
                x -= 1;
                System.out.printf("x = %d, y = %d\n", x, y);
                rlSwitch = true;
                firstColumn++;
            }

            if (!udSwitch) {
                // ↑
                for (int i=x;i>firstRow;i--) {
                    answer[i][y] = count;
                    count++;
                    x = i;
                }
                y += 1;
                System.out.printf("x = %d, y = %d\n", x, y);
                udSwitch = true;
                firstRow++;
            }

            System.out.println(Arrays.deepToString(answer));

            if (count == n * n + 1) break;
        }

        System.out.println(Arrays.deepToString(answer));

        return answer;
    }
}