package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strArr = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] bool = {true, false, true, false};
        System.out.println(Arrays.toString(s.solution(strArr, bool)));
    }
}

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) answer.add(todo_list[i]);
        }

        /*
        1. Java의 ArrayList 클래스에서 제공되는 toArray(T[] a) 메서드를 사용

        2. toArray 메서드의 매개변수로 전달된 new String[0]는 배열의 타입을 지정하는데,
        이 부분에서는 빈 문자열 배열을 생성하여 전달했습니다.
        이렇게 하면 toArray 메서드가 자동으로 적절한 크기의 배열을 생성
         */
        return answer.toArray(new String[0]);
    }
}