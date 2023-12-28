package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(s.solution(num_list, 3)));
    }
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] ints = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] ints1 = Arrays.copyOfRange(num_list, 0, n);

        return IntStream.concat(Arrays.stream(ints), Arrays.stream(ints1)).toArray();
    }
}