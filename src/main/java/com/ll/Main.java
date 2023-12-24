package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(s.solution("cvsgiorszzzmrpaqpe", index_list));
    }
}

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int index : index_list) {
            answer += my_string.charAt(index);
        }

        return answer;
    }
}