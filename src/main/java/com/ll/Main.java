package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] arr) {
        int count = 0;

        while(true) {
            int[] beforeArr = Arrays.copyOf(arr, arr.length);
            for(int i=0;i<arr.length;i++) {
                if(arr[i] % 2 ==0 && 50 <= arr[i]) arr[i] = arr[i]/2;
                else if (arr[i] % 2 == 1 && arr[i]<50) arr[i] = (arr[i]*2)+1;
            }
            count++;

            for(int i=0, j=0;i<arr.length;i++, j++) {
                if(arr[i] != beforeArr[j]) break;
                if(i == arr.length -1) return --count;
            }
        }
    }
}