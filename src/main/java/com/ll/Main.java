package com.ll;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("baconlettucetomato")));
    }
}

class Solution {
    public String[] solution(String myStr) {
        String[] splitStr = myStr.split("[abc]");
        String[] answer = Arrays.stream(splitStr).filter(str -> !Objects.equals(str, ""))
                .toArray(String[]::new);

        if (answer.length == 0) return new String[]{"EMPTY"};

        return answer;
    }
}