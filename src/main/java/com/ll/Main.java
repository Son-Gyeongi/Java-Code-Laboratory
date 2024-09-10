package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 4}, {2, 5}, {3, 6}};
        System.out.println(Arrays.deepToString(s.solution(arr1, arr2)));
    }
}

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length]; // arr1의 행 길이, arr2의 열 길이

        for (int x=0;x<arr1.length;x++) { // arr1의 행
            int arr1Point = 0;

            for (int i=0;i<arr2.length;i++) { // arr2의 열
                int j = 0; // arr2의 행

                for (int y=0;y<arr1[0].length;y++) { // arr1의 열
                    if (j >= arr2.length || i >= arr2[0].length) break;
                    arr1Point = arr1[x][y];
                    answer[x][i] += (arr1Point * arr2[j][i]);
                    System.out.println("answer["+x+"]["+i+"] += ("+arr1Point+" * "+"arr2["+j+"]["+i+"])");
                    j++;
                }
            }
            System.out.println();
        }

        return answer;
    }
}