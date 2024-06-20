package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        System.out.println(Arrays.toString(s.solution(picture, 2)));
    }
}

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];

        int x=0;
        int increase = k;
        for (int i=0;i<picture.length;i++) {
            System.out.println("i = "+i);
            String temp = "";
            String[] picArr = picture[i].split("");

            for (int j=0;j<picArr.length;j++) {
                temp += picArr[j].repeat(k);
            }

            for (;x<increase;x++) {
                answer[x] = temp;
            }
            increase+=k;
        }

        return answer;
    }
}