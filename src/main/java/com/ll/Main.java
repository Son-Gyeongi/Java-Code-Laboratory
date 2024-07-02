package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String[] strings = {"abce", "abcd", "cdx"}; // 2
//        String[] strings = {"sun", "bed", "car"}; // 1
        String[] strings = {"ae", "be", "ce", "ae"}; // 1
        System.out.println(Arrays.toString(s.solution(strings, 1)));
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int index = 0;

        // 1. a-z까지 반복문 돌리기
        for (char start='a';start<='z';start++) {
            int count = 0;
            // 2. strings 배열에서 각 요소들 중에 n인덱스랑 맞는 a-z 찾고 stringList에 넣기
            List<String> tempList = new ArrayList<>();
            for (int i=0;i<strings.length;i++) {
                if (start == strings[i].charAt(n)) { // 3. 같은 값일 경우 비교 후에 넣기
                    tempList.add(strings[i]);
                    count++;
                }
            }

            // tempList 정렬
            List<String> sortedList = tempList.stream().sorted().toList();
            // amswer 에 값 넣기
            for (int i=0;i<sortedList.size();i++) {
                answer[index++] = sortedList.get(i);
            }
        }

        return answer;
    }
}