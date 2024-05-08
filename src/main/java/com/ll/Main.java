package com.ll;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] puddles = {{2, 2}, {2, 3}};
//        int[][] puddles = {{1, 2}, {2, 1}}; // 함정으로 학교에 도착하지 못하는 경우
        System.out.println(s.solution(4,3, puddles));
    }
}

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        return new Calculator(m, n, puddles).calc();
    }

    class Calculator {
        private final Queue<Point> queue; // 다음 장소 저장
        private final int[][] puddles; // 방해 요소
        private final int[][] scores; // 처음 위치에서 마지막까지 도달하는데 드는 비용
        private final int n; // 세로
        private final int m; // 가로
        private int count; // 최단 경로의 개수

        public Calculator(int m, int n, int[][] puddles) {
            this.puddles = puddles;
            this.n = n;
            this.m = m;
            this.count = 0;

            this.scores = new int[n][m];
            this.scores[0][0] = 1;

            this.queue = new LinkedList<>();
            this.queue.add(new Point(0, 0));
        }

        // queue가 비어있지 않는 한 계속 queue의 일을 받아와서 처리
        public int calc() {

            // puddles 배열을 보고 scores 배열에 -1을 저장해서 해당 방해 요소에 이동 안되게 하기
            for (int i = 0; i < puddles.length; i++) {
                scores[puddles[i][1] -1][puddles[i][0] -1] = -1;
            }

            while (!queue.isEmpty()) {
                Point point = queue.poll();

                if (isEndPoint(point)) {
                    // 최종 방문 거리, 최단경로의 개수
                    count++;
                }

                // 우로 갈 수 있는지 체크
                if (canMoveRight(point)) {
                    // 현재 있는 곳에서 다음에 방문할 곳
                    queue.add(point.rightOne());
                    // 다음 방문할 곳에 거리 계산 = 현재 지점까지의 거리 + 1
                    this.scores[point.y][point.x + 1] = this.scores[point.y][point.x] + 1;
                }

                // 아래로 갈 수 있는지 체크
                if (canMoveDown(point)) {
                    // 현재 있는 곳에서 다음에 방문할 곳
                    queue.add(point.downOne());
                    // 다음 방문할 곳에 거리 계산 = 현재 지점까지의 거리 + 1
                    this.scores[point.y + 1][point.x] = this.scores[point.y][point.x] + 1;
                }
            }
            System.out.println(Arrays.deepToString(scores));

            return count % 1_000_000_007;
        }

        // 목적지까지 도달했는지 묻는 메서드
        private boolean isEndPoint(Point point) {
            return point.x == m - 1 && point.y == n - 1;
        }

        // 내가 오른쪽으로 갈 수 있는지 체크
        private boolean canMoveRight(Point point) {
            // 1. 없는 지점일 경우 (맨 오른쪽)
            if (point.x + 1 >= m) return false;

            // 오른쪽에 함정이 있는지
            if (scores[point.y][point.x + 1] == -1) return false;

            return true;
        }

        // 내가 아래쪽으로 갈 수 있는지 체크
        private boolean canMoveDown(Point point) {
            // 1. 없는 지점일 경우 (맨 아래쪽)
            if (point.y + 1 >= n) return false;

            // 아래쪽에 함정이 있는지
            if (scores[point.y + 1][point.x] == -1) return false;

            return true;
        }
    }


    /**
     * x : 1 이고 y : 2 이면
     * 배열 작성 시 map[2][1] 로 작성해야 함
     *
     * 여기서 인덱스로 볼때는 => map[2-1][1-1]
     */
    class Point {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // 현재 위치 기준에서 오른쪽 포인트
        public Point rightOne() {
            return new Point(x + 1, y);
        }

        // 현재 위치 기준에서 아래쪽 포인트
        public Point downOne() {
            return new Point(x, y + 1);
        }
    }
}