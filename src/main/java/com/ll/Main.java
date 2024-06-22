package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] board = {{1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1}};
        System.out.println(s.solution(board));
    }
}

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] temp = new int[board.length][board[0].length];

        // board에 행과 열 추가해서 감싸기
        int[][] boardCopy = new int[board.length+2][board[0].length+2];
        for (int i=1;i<boardCopy.length-1;i++) {
            for (int j=1;j<boardCopy[i].length-1;j++) {
                boardCopy[i][j] = board[i-1][j-1];
            }
        }
        // System.out.println(Arrays.deepToString(boardCopy));


        for (int i=1;i<boardCopy.length-1;i++) {
            for (int j=1;j<boardCopy[i].length-1;j++) {
                if (boardCopy[i][j] == 1) {
                    temp[i-1][j-1] = 1;
                } else {
                    // i-1 행 검사
                    if (boardCopy[i-1][j-1] == 1 || boardCopy[i-1][j] == 1 || boardCopy[i-1][j+1] == 1) {
                        temp[i-1][j-1] += 1;
                    }

                    // i+1 행 검사
                    if (boardCopy[i+1][j-1] == 1 || boardCopy[i+1][j] == 1 || boardCopy[i+1][j+1] == 1) {
                        temp[i-1][j-1] += 1;
                    }

                    // j-1 열 검사
                    if (boardCopy[i-1][j-1] == 1 || boardCopy[i][j-1] == 1 || boardCopy[i+1][j-1] == 1) {
                        temp[i-1][j-1] += 1;
                    }

                    // j+1 열 검사
                    if (boardCopy[i-1][j+1] == 1 || boardCopy[i][j+1] == 1 || boardCopy[i+1][j+1] == 1) {
                        temp[i-1][j-1] += 1;
                    }
                }
            }
        }

         System.out.println(Arrays.deepToString(temp));
        // temp에 0의 개수 세기
        for (int i=1;i<temp.length;i++) {
            for (int j=0;j<temp[i].length;j++) {
                if (temp[i][j] == 0) answer +=1;
            }
        }

        return answer;
    }
}