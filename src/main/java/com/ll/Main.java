package com.ll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strArr = {"a", "bc", "d", "efg", "hi"};
        System.out.println(s.solution(strArr));
    }
}

class Solution {
    public int solution(String[] strArr) {
        int[] strCount = new int[strArr.length];

        for (int i = 0; i < strCount.length; i++) {
            strCount[i] = strArr[i].length();
        }

        Map<Integer, Integer> myMap =new HashMap<>();

        Arrays.stream(strCount).forEach(str -> {
            // 값이 있으면
            if (myMap.containsKey(str)) {
                Integer count = myMap.get(str);
                myMap.put(str, ++count);
            } else { // 값이 없으면
                myMap.put(str, 1);
            }
        });

        // Map 반복문으로 순회, 큰 값 꺼내기
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (max < value) max = value;
        }

        return max;
    }
}