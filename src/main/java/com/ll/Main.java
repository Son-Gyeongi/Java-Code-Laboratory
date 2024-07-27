package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
//        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int[] ingredient = {1, 2, 3, 2, 1, 2, 3, 1, 1};
        System.out.println(s.solution(ingredient));
    }
}

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        // 빵 - 1, 야채 - 2, 고기 - 3
        // 1-2-3-1 이 일심동체로 햄버거 한개

        if (ingredient.length < 4) return 0; // 13, 15, 16, 17 테스트 케이스

        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);
        }

        System.out.println("sb  =  "+sb);

        for (int i=0;3<sb.length();) {
            if (sb.charAt(i) == '1'
            && sb.charAt(i+1) == '2'
            && sb.charAt(i+2) == '3'
            && sb.charAt(i+3) == '1') {
                System.out.println("sb.charAt(i)  =  "+sb.charAt(i));
                System.out.println("sb.charAt(i+1)  =  "+sb.charAt(i+1));
                System.out.println("sb.charAt(i+2)  =  "+sb.charAt(i+2));
                System.out.println("sb.charAt(i+3)  =  "+sb.charAt(i+3));

                sb.replace(i, i+4, "");
                i--;
                answer++;
                continue;
            }

            i++;

            if (i == ingredient.length-3) break;
        }
        System.out.println("sb  =  "+sb);

        return answer;
    }
}