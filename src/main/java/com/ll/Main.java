package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}; // "ICN", "JFK", "HND", "IAD"
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}}; // "ICN", "ATL", "ICN", "SFO", "ATL", "SFO"
//        String[][] tickets = {{"ICN", "AOO"}, {"AOO", "BOO"}, {"AOO", "BOO"}, {"BOO", "AOO"}, {"BOO", "FOO"}, {"FOO", "COO"},{"COO", "ZOO"}}; // "ICN", "AOO", "BOO", "AOO", "BOO", "FOO", "COO", "ZOO"
//        String[][] tickets = {{"ICN", "AOO"}, {"AOO", "BOO"}, {"AOO", "COO"}, {"COO", "AOO"}, {"BOO", "ZOO"}}; // "ICN", "AOO", "COO", "AOO", "BOO", "ZOO" 실패
//        String[][] tickets = {{"ICN", "BOO"}, {"ICN", "COO"}, {"COO", "DOO"}, {"DOO", "COO"}, {"BOO", "DOO"}, {"DOO", "BOO"}, {"BOO", "ICN"}, {"COO", "BOO"}}; // "ICN", "BOO", "DOO", "BOO", "ICN", "COO", "DOO", "COO", "BOO" 실패
//        String[][] tickets = {{"ICN", "AAA"}, {"ICN", "AAA"}, {"ICN", "AAA"}, {"AAA", "ICN"}, {"AAA", "ICN"}}; // "ICN", "AAA", "ICN", "AAA", "ICN", "AAA"
//        String[][] tickets = {{"ICN", "AOO"}, {"ICN", "AOO"}, {"AOO", "ICN"}, {"AOO", "COO"}}; // "ICN", "AOO", "ICN", "AOO", "COO"
//        String[][] tickets = {{"ICN", "AAA"}, {"ICN", "AAA"}, {"ICN", "AAA"}, {"AAA", "ICN"}, {"AAA", "ICN"}}; // "ICN", "AAA", "ICN", "AAA", "ICN", "AAA"
        System.out.println(Arrays.toString(s.solution(tickets)));
    }
}

class Solution {
    // 알파벳 순서가 앞서는 여행 경로 저장
    private Queue<String> queue = new PriorityQueue<>();
    // 이미 처리한 배열 검사
    private boolean[] check;

    public String[] solution(String[][] tickets) {
        check = new boolean[tickets.length];
        // dfs로 여행 경로 짜기
        travelRoute(tickets, 0, "ICN", "ICN");
        // 큐에 저장한 여행 경로 가져오기
        return queue.peek().split(" ");
    }

    // DFS는 재귀를 사용
    private void travelRoute(String[][] tickets, int depth, String start, String total) {

        if (depth == tickets.length) {
            queue.add(total);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!check[i] && Objects.equals(tickets[i][0], start)) {
                // 이제 처리할 배열인 경우 true
                check[i] = true;
                travelRoute(tickets, depth + 1, tickets[i][1], total + " " + tickets[i][1]);
                // 재귀함수에서 빠져나온 배열의 인덱스인 경우 false
                check[i] = false;
            }
        }
    }
}