package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(s.solution(citations));
    }
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        // citations를 내림차순으로 정렬하고 인용횟수 0번을 제외하고 count해서 같은지 확인 그리고 같으면 반환
        int[] reverseCitations = Arrays.stream(citations)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();

        int count = 0;
        for (int i = 0; i < reverseCitations.length; i++) {
            int reverseCitation = reverseCitations[i];

            if (reverseCitation <= count) return count;

            count++;
        }

        if (count == citations.length) answer = count;

        return answer;
    }
}