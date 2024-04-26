package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int num = arr[0]; // 연속된 수 저장
        // 연속된 숫자 제거
        for(int i=0;i<arr.length;i++){
            if(num != arr[i]) {
                answer.add(num);
                num = arr[i];
            }
        }
        answer.add(num);

        return answer.stream().mapToInt(a -> a).toArray();
    }
}