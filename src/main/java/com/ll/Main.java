package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(s.solution("rermgorpsam", queries));
    }
}

class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] strArr = my_string.split("");

        for (int[] query : queries) {
//            boolean queryOdd = (query[1] - query[0] + 1) % 2 == 1; // 홀수면 중간 숫자 있음
            int changeIdx = (query[1] + query[0]) / 2;
            int j = query[0];

            for (int i=query[1];i> changeIdx;i--) {
                String temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;

                j++;

                // 중간값은 굳이 계산 안해도 되겠구나
                /*if(queryOdd && (i + 1) == changeIdx) {
                    strArr[i+1] = strArr[i+1];
                }*/
            }
        }

        // strArr => [p, r, o, g, r, a, m, m, e, r, s]
//        return Arrays.stream(strArr).collect(Collectors.joining());
        return String.join("", strArr);
    }
}