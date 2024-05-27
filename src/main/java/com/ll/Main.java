package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
        System.out.println(Arrays.toString(s.solution(numlist, 30)));
    }
}

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] temp = new int[numlist.length];

        for (int i=0;i<numlist.length;i++) {
            temp[i] = Math.abs(n-numlist[i]);
        }

        int idx = 0;
        for (int i=0;i<=10000;i++) {
            int count = 0;
            for (int j=0;j<numlist.length;j++) {
                if (i == temp[j]) {
                    answer[idx] = numlist[j];
                    idx++;
                    count++;
                }
                if (count > 1) {
                    int max = Math.max(answer[idx-2], answer[idx-1]);
                    int min = Math.min(answer[idx-2], answer[idx-1]);
                    answer[idx-2] = max;
                    answer[idx-1] = min;
                }
            }
        }

        return answer;
    }
}