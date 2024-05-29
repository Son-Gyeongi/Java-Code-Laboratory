package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(5, 555)));
    }
}

class Solution {
    public int[] solution(int l, int r) {
        // int[] answer = {};
        List<Integer> answer = new ArrayList<>();

        for (int i=l;i<=r;i++) {
            String str = String.valueOf(i);

            if (str.contains("0")
                    && str.contains("5")
                    && !str.contains("1")
                    && !str.contains("2")
                    && !str.contains("3")
                    && !str.contains("4")
                    && !str.contains("6")
                    && !str.contains("7")
                    && !str.contains("8")
                    && !str.contains("9")) answer.add(i);
            else if (str.contains("5")
                    && !str.contains("1")
                    && !str.contains("2")
                    && !str.contains("3")
                    && !str.contains("4")
                    && !str.contains("6")
                    && !str.contains("7")
                    && !str.contains("8")
                    && !str.contains("9")) answer.add(i);
        }

        System.out.println(answer);
        if (answer.isEmpty()) return new int[]{-1};

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}