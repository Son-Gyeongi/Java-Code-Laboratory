package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1, 2, 3, 3, 3, 4};
        System.out.println(s.solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        int[] numArr = new int[1000];

        // numArr 배열에 array 배열 값을 인덱스에 맞춰서 넣기
        for (int i=0;i<numArr.length;i++) {
            for (int j=0;j<array.length;j++) {
                if (i == array[j]) {
                    numArr[i] += 1;
                }
            }
        }

        // numArr에서 Max 값 찾고 해당 인덱스 알아내기
        int max = Arrays.stream(numArr).max().getAsInt();

        int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == max) {
                answer = i;
                count++;
            }
        }

        if (count > 1) answer = -1;

        return answer;
    }
}