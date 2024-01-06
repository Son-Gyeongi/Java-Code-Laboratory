package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("xabcxdefxghi")));
    }
}

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
//        char[] charArray = myString.toCharArray(); // [o, x, o, o, x, o, x, x, o, x]
//        String[] split = myString.split("x"); // "oxooxoxxox" [o, oo, o, , o]
//        System.out.println(Arrays.toString(split)); // "xabcxdefxghi" [, abc, def, ghi]

//        if (charArray[0] == 'x') answer.add(0);
//        if (myString.charAt(0) == 'x') answer.add(0);

        Arrays.stream(myString.split("x"))
                .map(i -> answer.add(i.length())).toArray();

//        if (charArray[charArray.length -1] == 'x') answer.add(0);
        if (myString.charAt(myString.length() -1) == 'x') answer.add(0);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}