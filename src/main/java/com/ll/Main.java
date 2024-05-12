package com.ll;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 1, 2, 2, 3};
//        int[] arr = {0, 1, 1, 1, 1};
        System.out.println(Arrays.toString(s.solution(arr, 3)));
    }
}

class Solution {
    public Integer[] solution(int[] arr, int k) {
        Integer[] answer = new Integer[k];

        // 중복 없는 Set 컬렉션
        Set<Integer> setArr = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            setArr.add(arr[i]);
        }

        // 주석
        for (Integer a : setArr) {
            System.out.println(a);
        }

        setArr.toArray(answer);
        System.out.println(Arrays.toString(answer));

        for (int i = k-1; i < answer.length; i++) {
            answer[i] = -1;
        }

        return answer;
    }
}