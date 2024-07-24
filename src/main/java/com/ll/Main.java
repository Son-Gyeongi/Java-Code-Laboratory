package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] lost = {2, 4};
        int[] lost = {28, 30};
//        int[] reserve = {1, 3, 5};
        int[] reserve = {27, 29};
        System.out.println(s.solution(30, lost, reserve));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 1. 모든 n 학생 수를 Map에 넣기
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        // 2. lost 학생들은 0 값을 넣기
        for (int i=0;i<lost.length;i++) {
            map.put(lost[i], 0);
        }

        // 3. reserve를 확인해서 lost 학생들에게 옷을 빌려줄 수 있는지 확인
        // 자기자신이 체육복 안 가져왔는지 확인
        for (int i=0;i<reserve.length;i++) {
            for (int j=0;j<lost.length;j++) {
                if (reserve[i] == lost[j]) {
                    map.put(lost[j], 1);
                    reserve[i] = -1;
                }
            }
        }

        // 다른 사람 체육복 빌리기
        for (int i=0;i<reserve.length;i++) {
            for (int j=0;j<lost.length;j++) {
                if (reserve[i] == (lost[j] - 1) || reserve[i] == (lost[j] + 1)) {
                    map.put(lost[j], 1);
                    reserve[i] = -1; // 여벌 옷 빌려준 사람 제외
                    lost[j] = -5; // 여벌 옷 빌린 사람 제외
                }
            }
        }

        // 4. Map을 확인해서 1인 학생의 수 구하기 (체육복이 있는 학생 수 세기)
        for (int i=1;i<=map.size();i++) {
            if (map.get(i) == 1) answer++;
        }

        return answer;
    }
}