package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] puddles = {{2, 2}};
//        int[][] puddles = {{1, 2}, {2, 1}}; // 함정으로 학교에 도착하지 못하는 경우
        System.out.println(s.solution(4,3, puddles));
    }
}

class Solution {
    private int[][] scores;
    public int solution(int m, int n, int[][] puddles) {
        scores = new int[n][m]; // m 열, n 행
        scores[0][0] = 1;

        // puddles 배열을 보고 scores 배열에 -1을 저장해서 해당 방해 요소에 이동 안되게 하기
        for (int[] puddle : puddles) {
            scores[puddle[1] - 1][puddle[0] - 1] = -1;
        }

        return onTheWayToSchool(m, n);
    }

    public int onTheWayToSchool(int m, int n) {

        // 목적지까지 갈 수 있는 경우의 수 scores에 넣기
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == -1) continue;

                if (i > 0 && j > 0) {
                    int left = scores[i][j - 1] != -1 ? scores[i][j - 1] : 0;
                    int up = scores[i - 1][j] != -1 ? scores[i - 1][j] : 0;
                    scores[i][j] = (left % 1_000_000_007) + (up % 1_000_000_007) % 1_000_000_007;
                } else if (i > 0 && scores[i - 1][0] != -1) {
                    scores[i][0] = scores[i - 1][0] % 1_000_000_007;
                } else if (j > 0 && scores[0][j - 1] != -1){ // i == 0
                    scores[0][j] = scores[0][j - 1] % 1_000_000_007;
                }
            }
        }

        return scores[n-1][m-1] % 1_000_000_007;
    }
}