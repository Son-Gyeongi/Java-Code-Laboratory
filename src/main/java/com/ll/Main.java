package com.ll;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] slicer = {1, 5, 2};
//        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] slicer = {0, 1, 1};
        int[] num_list = {10, 8, 6, 4, 2};
        System.out.println(Arrays.toString(s.solution(2, slicer, num_list)));
    }
}

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1 :
                return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2 :
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 :
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4 :
                int[] array = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                int count = (int) IntStream.range(0, array.length).filter(a -> a % slicer[2] == 0).count();
                answer = new int[count];
                int j = 0;
                for (int i = 0; i < count; i++) {
                    answer[i] = array[j];
                    j += slicer[2];
                }
        }

        return answer;
    }
}