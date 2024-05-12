package com.ll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 1, 2, 2, 3};
//        int[] numbers = {0, 1, 1, 1, 1};
        System.out.println(Arrays.toString(s.solution(arr, 3)));
    }
}

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];

        // 중복 없는 Set 컬렉션
        Set<Integer> setArr = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            setArr.add(arr[i]);
        }

        // 주석
        for (Integer a : setArr) {
            System.out.println(a);
        }

        return answer;
    }
}