package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(29183, 1));
    }
}

class Solution {
    public int solution(int num, int k) {
        String str = num + "";
        String[] strArr = str.split("");

        for (int i = 0; i < str.length(); i++) {
            if (strArr[i].equals(k + "")) {
                return i + 1;
            }
        }

        return -1;
    }
}