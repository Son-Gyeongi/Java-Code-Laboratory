package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(Arrays.toString(s.solution(arr, flag)));
    }
}

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int repeat = arr[i] * 2;
                for (int j = 0; j < repeat; j++) answer.add(arr[i]);
            } else {
                for (int j = 0; j < arr[i]; j++) answer.remove(answer.size() - 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}