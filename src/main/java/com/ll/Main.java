package com.ll;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(420)));
    }
}

class Solution {
    public int[] solution(int n) {
        // Set은 중복, 순서 없음 - TreeSet은 오름차순 정렬해줌
        Set<Integer> answer = new TreeSet<>();

        for (int i=2;i<=n;i++) {
            while(n % i == 0) {
                answer.add(i);
                n /= i;
            }

            if (n/i == 1) {
                answer.add(n);
                break;
            }
        }

        return answer.stream().mapToInt(a -> a).toArray();
    }
}