package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(s.solution(arr, delete_list)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>(arr.length);

        // int 배열을 Integer 리스트로 변환
        for (int value : arr) {
            list.add(value);
        }

        for (int delete : delete_list) {
            for (int j = 0; j < list.size(); j++) {
                if (delete == list.get(j)) {
                    list.remove(j);
                }
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}