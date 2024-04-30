package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while(i < arr.length) {
            if (!stk.isEmpty() && stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i += 1;
            } else if (!stk.isEmpty() && stk.peek() >= arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
                i += 1;
            }
        }

        // Integer[] array = stk.toArray(Integer[]::new);
        // System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        int[] array1 = stk.stream().mapToInt(a -> a).toArray();
        System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));

        return array1;
    }
}