package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(s.solution("rermgorpsam", queries));
    }
}

class Solution {
    public String solution(String myString, int[][] queries) {
        for (int[] arr : queries) {
            myString = myString.substring(0, arr[0])
                    + new StringBuilder(myString.substring(arr[0], arr[1] + 1))
                    .reverse().toString()
                    + myString.substring(arr[1] + 1);
        }
        return myString;
    }
}