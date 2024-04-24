package com.ll;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}; // "ICN", "JFK", "HND", "IAD"
//        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}}; // "ICN", "ATL", "ICN", "SFO", "ATL", "SFO"
//        String[][] tickets = {{"ICN", "AOO"}, {"AOO", "BOO"}, {"AOO", "BOO"}, {"BOO", "AOO"}, {"BOO", "FOO"}, {"FOO", "COO"},{"COO", "ZOO"}}; // "ICN", "AOO", "BOO", "AOO", "BOO", "FOO", "COO", "ZOO"
        String[][] tickets = {{"ICN", "AOO"}, {"AOO", "BOO"}, {"AOO", "COO"}, {"COO", "AOO"}, {"BOO", "ZOO"}}; // "ICN", "AOO", "COO", "AOO", "BOO", "ZOO" 실패
//        String[][] tickets = {{"ICN", "BOO"}, {"ICN", "COO"}, {"COO", "DOO"}, {"DOO", "COO"}, {"BOO", "DOO"}, {"DOO", "BOO"}, {"BOO", "ICN"}, {"COO", "BOO"}}; // "ICN", "BOO", "DOO", "BOO", "ICN", "COO", "DOO", "COO", "BOO" 실패
//        String[][] tickets = {{"ICN", "AAA"}, {"ICN", "AAA"}, {"ICN", "AAA"}, {"AAA", "ICN"}, {"AAA", "ICN"}}; // "ICN", "AAA", "ICN", "AAA", "ICN", "AAA"
//        String[][] tickets = {{"ICN", "AOO"}, {"ICN", "AOO"}, {"AOO", "ICN"}, {"AOO", "COO"}}; // "ICN", "AOO", "ICN", "AOO", "COO"
//        String[][] tickets = {{"ICN", "AAA"}, {"ICN", "AAA"}, {"ICN", "AAA"}, {"AAA", "ICN"}, {"AAA", "ICN"}}; // "ICN", "AAA", "ICN", "AAA", "ICN", "AAA"
        System.out.println(Arrays.toString(s.solution(tickets)));
    }
}

class Solution {
    public String[] solution(String[][] tickets) {
        return new Calculator(tickets).calc();
    }
}

class Calculator {
    private final String[][] tickets;
    private final int n; // 행, 가로, 너비
    private final int m; // 열, 세로, 높이
    private final Queue<Point> queue; // 할 일 리스트
    private final boolean[][] done; // 이미 방문한 곳
    private final String[] answer; // 여행경로

    public Calculator(String[][] tickets) {
        this.tickets = tickets;
        this.n = 2;
        this.m = tickets.length;
        this.queue = new LinkedList<>();
        this.done = new boolean[m][n];
        this.answer = new String[tickets.length + 1];

        this.queue.add(new Point(0,0 ));
        // 항상 tickets[0][0]은 이미 추가
        this.answer[0] = tickets[0][0];
//        this.done[0][0] = true;
    }

    public String[] calc() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            System.out.printf("탐색(x: %d, y: %d)\n", point.x, point.y);
            int count = (int) Arrays.stream(answer).filter(Objects::nonNull).count(); // answer에 들어있는 요소 개수

            if (count == tickets.length + 1) return answer;

            // (0, 0) 또는 target (x, 0) 이랑 같은 값이 있는지 검사, 한번도 안 지나간 곳
            String min = tickets[point.y][point.x + 1];
            int idx = 0;
            for (int i = 1; i < tickets.length; i++) {
                // 있으면 done[][]에서 true가 아닌 경우만 검사
                if (Objects.equals(tickets[point.y][point.x], tickets[i][0]) && !done[i][0]) {
                    // 있으면 (0, 1) y가 1인 경우에서 알파벳 순서로 answer[1]에 값 넣기
                    // 다음 경로이지만 길이 없는 경우
                    if (!existNext(tickets[i][1])) continue;
                    min = min.charAt(0) <= tickets[i][1].charAt(0) ? min : tickets[i][1];
                    if (Objects.equals(min, tickets[i][1])) idx = i;
                }
            }

            // min 찾았음, 같은 (x,0)이 없을 경우 거르기
            // 그리고 done[][]에도 true 넣기
            if (Objects.equals(min, "")) {
                answer[count] = tickets[point.y][point.x + 1];
                done[point.y][point.x] = true;
                done[point.y][point.x + 1] = true;
            } else {
                answer[count] = min;
                done[idx][0] = true;
                done[idx][1] = true;
            }

            // answer이 마지막 배열일 경우
            if (count == answer.length - 1) {
                answer[answer.length - 1] = tickets[point.y][point.x + 1];
                return answer;
            }

            // 다음에 들어갈 큐에 어떤 좌표가 들어갈 지 반복문 돌려야 함 이번에는 (x, 1)을 검사해야함
            // 예시) ["INC", "ATL"] 에서 "ATL"을 찾았고 해당 ATL이랑 같은 ["ATL", "ICN"], ["ATL", "SFO"] 둘 중 하나를 찾아야 함...
            String nextSecond = ""; // 다음 행선지 정할 때 사용, 다음 행선지의 두번째 값
            int index = 0;
            for (int i = 1; i < tickets.length; i++) {
                // 있으면 done[][]에서 true가 아닌 경우만 검사
                if (Objects.equals(tickets[i][0], answer[count]) && !done[i][0]) {
                    if (Objects.equals(nextSecond, "")) nextSecond = tickets[i][1];
                    // 다음 경로이지만 길이 없는 경우, 그리고 마지막 경로에서는 다음 길이 없어도 통과(count에 1을 더한 이유 처음에 계산할 때 3이고 중간에 answer에 1개 더 넣게 되어서)
                    if (!existNext(tickets[i][1]) && count + 1 < answer.length - 1) continue;
                    nextSecond = nextSecond.charAt(0) <= tickets[i][1].charAt(0) ? nextSecond : tickets[i][1];
                    if (Objects.equals(nextSecond, tickets[i][1])) index = i;
                }
            }

            // 다음에 들어갈 값 queue에 넣기
            queue.add(new Point(0, index));
        }

        return answer;
    }

    private boolean existNext(String next) {
        int count = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (Objects.equals(tickets[i][0], next)) count++;
        }

        return count > 0;
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
}