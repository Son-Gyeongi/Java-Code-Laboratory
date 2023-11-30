package com.ll;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5, 7, 8, 3};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] num_list) {
        // 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return
        int reduce = IntStream.of(num_list).reduce(1, (a, b) -> a * b);
        int sum = (int) Math.pow(IntStream.of(num_list).sum(), 2);

        return reduce < sum ? 1 : 0;
    }
}