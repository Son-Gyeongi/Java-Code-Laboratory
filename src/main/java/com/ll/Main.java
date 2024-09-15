package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(s.solution(clothes));
    }
}

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        // 각 의상 종류에 맞는 의상 이름 저장하기
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0;i<clothes.length;i++) {
            map.putIfAbsent(clothes[i][1], new ArrayList<>());

            map.get(clothes[i][1]).add(clothes[i][0]);
        }

        // 그리고 조합 여러개 (의상 종류가 2개 이상일 때)
        int[] array = new int[map.size()];
        int idx = 0;
        for (String key : map.keySet()) {
            array[idx++] = map.get(key).size(); // 의상 종류에 옷 개수
        }

        // n차식 계수의 합
        int mul = 1;
        for (int i=0;i<array.length;i++) {
            mul *= 1+array[i];
        }

        answer += (mul-1);

        return answer;
    }
}