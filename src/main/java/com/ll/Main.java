package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        int[] rank = {6, 1, 5, 2, 3, 4};
//        boolean[] attendance = {false, true, true, true, true, false, false};
        boolean[] attendance = {true, false, true, false, false, true};
        System.out.println(s.solution(rank, attendance));
    }
}

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] finalRank = new int[rank.length];

        for (int i=0;i<rank.length;i++) {
            if (attendance[i]) finalRank[i] = rank[i];
            else finalRank[i] = -1;
        }

        System.out.println(Arrays.toString(finalRank));

        int count = 0;
        for (int i=0;i<=100;i++) {
            for (int j=0;j<finalRank.length;j++) {
                if(i == finalRank[j] && count == 0) {
                    answer += (10000 * j);
                    count++;
                } else if(i == finalRank[j] && count == 1) {
                    answer += (100 * j);
                    count++;
                } else if(i == finalRank[j] && count == 2) {
                    answer += j;
                    count++;
                    break;
                }

                if (count == 3) break;
            }
        }

        return answer;
    }
}