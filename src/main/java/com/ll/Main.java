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
        int answer = clothes.length; // 일단 기본 옷 1개씩 (중복되지 않는 의상 종류 개수 더하기)

        System.out.println(answer);

        // 각 의상 종류에 맞는 의상 이름 저장하기
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0;i<clothes.length;i++) {
            map.putIfAbsent(clothes[i][1], new ArrayList<>());

            map.get(clothes[i][1]).add(clothes[i][0]);
        }

        System.out.println(map);

        // 그리고 조합 여러개 (의상 종류가 2개 이상일 때)
        int[] array = new int[map.size()];
        int idx = 0;
        if (1 < map.size()) {
            for (String key : map.keySet()) {
                array[idx++] = map.get(key).size(); // 의상 종류에 옷 개수
            }
        }

        // 각 의상 종류의 옷 개수를 배열에 담았다.
        int totalSum = 0;
        for (int i=0;i<array.length-1;i++) {
            int value1 = array[i];
            int sum = 0;

            for (int j=i+1;j<array.length;j++) {
                int value2 = array[j];

                sum += (value1*value2);
            }

            totalSum += sum;
        }
        System.out.println("totalSum = "+totalSum);

        // map 사이즈가 3이상인 경우 - 옷을 모두 입는 경우
        if (map.size() > 2) {
            int mul = 1;

            for (int i=0;i<array.length;i++) {
                mul *= array[i];
            }

            totalSum += mul;
            System.out.println("mul = "+mul);
        }

        answer += totalSum;

        return answer;
    }
}