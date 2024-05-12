package com.ll;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 1, 2, 2, 3};
//        int[] arr = {0, 1, 1, 1, 1};
        System.out.println(Arrays.toString(s.solution(arr, 3)));
    }
}

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Integer[] temp = {};

        // 중복 없고 순서
        Set<Integer> setArr = new LinkedHashSet<>();

        for (int a : arr) {
            setArr.add(a);
        }

        temp = setArr.toArray(temp);

        for (int i = 0; i < k; i++) {
            if (i >= temp.length) {
                answer[i] = -1;
                continue;
            }
            answer[i] = temp[i];
        }

        return answer;
    }
}