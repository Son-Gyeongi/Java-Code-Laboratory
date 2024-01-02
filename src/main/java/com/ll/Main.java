package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(10)));
    }
}

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();

        while (n != 1) {
            answer.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        answer.add(n);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}