package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int []A = {1, 4, 2};
        int []B = {5, 4, 4};
        System.out.println(s.solution(A, B));
    }
}

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // 1. A 배열을 내림차순으로 저장하기
        Integer[] a = new Integer[A.length];

        for (int i=0;i<A.length;i++) {
            a[i] = A[i];
        }
        Arrays.sort(a, Collections.reverseOrder());

        // 1-1. B 배열을 오름차순으로 저장하기
        Integer[] b = new Integer[B.length];

        for (int i=0;i<B.length;i++) {
            b[i] = B[i];
        }
        Arrays.sort(b);

        // 2. A 각 요소와 B 모든 요소를 곱해서 작은 값을 answer에 더하기
        for (int i=0;i<a.length;i++) {
            int mulA = a[i];
            int mulB = b[i];

            answer += (mulA * mulB);
        }

        return answer;
    }
}