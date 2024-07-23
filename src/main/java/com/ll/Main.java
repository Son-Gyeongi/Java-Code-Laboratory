package com.ll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] keymap = {"AA"};
        String[] targets = {"B"};
        System.out.println(Arrays.toString(s.solution(keymap, targets)));
    }
}

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();

        // 1. Map 에 keymap 각 요소 누르는 값 넣기
        for (int i=0;i<keymap.length;i++) {
            String[] key = keymap[i].split("");

            for (int j=0;j<key.length;j++) {
                int value = map.getOrDefault(key[j], j+1);

                map.put(key[j], value > j+1 ? j+1 : value);
            }
        }

        // 2. map에 맞게 targets 계산하기
        for (int i=0;i<targets.length;i++) {
            String[] target = targets[i].split("");

            for (int j=0;j<target.length;j++) {
                if (map.get(target[j]) == null) {
                    answer[i] = -1;
                    break;
                }

                int value = map.get(target[j]);

                answer[i] += value;
            }
        }

        return answer;
    }
}