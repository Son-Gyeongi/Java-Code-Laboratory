package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("banana", "nan"));
    }
}

class Solution {
    public int solution(String my_string, String is_suffix) {
        return !my_string.contains(is_suffix) ? 0 :
                my_string.charAt(my_string.length() - 1) != is_suffix.charAt(is_suffix.length() - 1) ? 0 : 1;
    }
}