package com.ll;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        work1();
        work2();
    }

    private static void work1() {
        int correctRs = 11; // 정답
        // [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]
        int rs = new Solution().solution(
                new int[][]{
                        {1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {0, 0, 0, 0, 1}
                }
        );

        System.out.println("== work1 ==");
        System.out.println("correctRs = " + correctRs);
        System.out.println("rs = " + rs);
        System.out.println(correctRs == rs ? "pass" : "fail");
    }

    private static void work2() {
        int correctRs = -1; // 정답
        // [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]
        int rs = new Solution().solution(
                new int[][]{
                        {1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 1}
                }
        );

        System.out.println("== work2 ==");
        System.out.println("correctRs = " + correctRs);
        System.out.println("rs = " + rs);
        System.out.println(correctRs == rs ? "pass" : "fail");
    }
}

class Solution {
    public int solution(int[][] maps) {
        return new Calculator(maps).calc();
    }
}

class Calculator {
    /*
    BFS 는 '할 일 리스트' 필요
    Queue에는 방문할 목적지 필요 - 좌표값 2개로 이루어져 있다. // <Point> 자료형 만들기
     */
    private final Queue<Point> queue;
    private final int[][] map;
    /*
    처음 위치에서 마지막까지 도달하는데 드는 비용
    상하좌우 탐색시 - 방문 여부와 거리
    0 : 아직 탐색되지 않은 곳
    !0 : 이미 탐색된 곳
     */
    private final int[][] scores;
    private final int n; // 행, 가로, 너비
    private final int m; // 열, 세로, 높이

    public Calculator(int[][] map) {
        this.map = map;
        this.n = map[0].length;
        this.m = map.length;
        this.scores = new int[m][n];
        this.queue = new LinkedList<>(); // Queue의 구현체는 보통 LinkedList<> 사용
        // 맨 처음에 queue에 할 일을 넣어줘야 함
        // 시작점 넣어주기 (0, 0)을 탐색해라
        Point basePoint = new Point(0, 0);
        addQueue(basePoint, basePoint);
    }

    // queue가 비어있지 않는 한 계속 queue의 일을 받아와서 처리
    public int calc() {
        while (!queue.isEmpty()) {
            Point point = queue.poll(); // poll()는 queue에 있는 값을 빼냄, 앞에서 빼기

            System.out.printf("탐색(x: %d, y: %d)\n", point.x, point.y);

            if (isEndPoint(point)) {
                // 최종 방문 거리
                return scores[point.y][point.x];
            }

            // 좌로 갈 수 잇는지 체크
            if (canMoveLeft(point)) {
                addQueue(point.leftOne(), point);
            }

            // 우로 갈 수 있는지 체크
            if (canMoveRight(point)) {
                addQueue(point.rightOne(), point);
            }

            // 위로 갈 수 있는지 체크
            if (canMoveUp(point)) {
                addQueue(point.upOne(), point);
            }

            // 아래로 갈 수 있는지 체크
            if (canMoveDown(point)) {
                addQueue(point.downOne(), point);
            }
        }

        // 실패했다면 -1 반환
        return -1;
    }

    // fromPoint 에서 newPoint로 갈거다.
    private void addQueue(Point newPoint, Point fromPoint) {
        // 현재 있는 곳에서 다음에 방문할 곳
        queue.add(newPoint); // queue의 뒤에서 넣기
        // 다음 방문할 곳 = 현재 지점까지의 거리 + 1
        this.scores[newPoint.y][newPoint.x] = this.scores[fromPoint.y][fromPoint.x] + 1;
    }

    // 내가 도달했는지 묻는 메서드
    private boolean isEndPoint(Point point) {
        return point.x == n - 1 && point.y == m - 1;
    }

    // 내가 왼쪽으로 갈 수 있는지 체크
    private boolean canMoveLeft(Point point) {
        // 1. 없는 지점일 경우(맨 왼쪽)
        if ( point.x - 1 < 0 ) return false;

        // 2. 왼쪽이 벽인지
        if ( map[point.y][point.x - 1] == 0 ) return false;

        // 3. 이미 내가 방문한 곳인지
        if ( scores[point.y][point.x - 1] > 0) return false;

        return true;
    }

    // 내가 오른쪽으로 갈 수 있는지 체크
    private boolean canMoveRight(Point point) {
        // 1. 없는 지점일 경우(맨 오른쪽)
        if ( point.x + 1 >= n ) return false;

        // 2. 오른쪽이 벽인지
        if ( map[point.y][point.x + 1] == 0 ) return false;

        // 3. 이미 내가 방문한 곳인지
        if ( scores[point.y][point.x + 1] > 0) return false;

        return true;
    }

    // 내가 위쪽으로 갈 수 있는지 체크
    private boolean canMoveUp(Point point) {
        // 1. 없는 지점일 경우(맨 위쪽)
        if ( point.y - 1 < 0 ) return false;

        // 2. 위쪽이 벽인지
        if ( map[point.y - 1][point.x] == 0 ) return false;

        // 3. 이미 내가 방문한 곳인지
        if ( scores[point.y - 1][point.x] > 0) return false;

        return true;
    }

    // 내가 아래쪽으로 갈 수 있는지 체크
    private boolean canMoveDown(Point point) {
        // 1. 없는 지점일 경우(맨 아래쪽)
        if ( point.y + 1 >= m ) return false;

        // 2. 아래쪽이 벽인지
        if ( map[point.y + 1][point.x] == 0 ) return false;

        // 3. 이미 내가 방문한 곳인지
        if ( scores[point.y + 1][point.x] > 0) return false;

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
    // 값이 바뀔리 없으니 final로
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 현재 위치 기준에서 좌측 포인트
    public Point leftOne() {
        return new Point(x - 1, y);
    }

    // 현재 위치 기준에서 우측 포인트
    public Point rightOne() {
        return new Point(x + 1, y);
    }

    // 현재 위치 기준에서 위쪽 포인트
    public Point upOne() {
        return new Point(x, y - 1);
    }

    // 현재 위치 기준에서 아래쪽 포인트
    public Point downOne() {
        return new Point(x, y + 1);
    }
}