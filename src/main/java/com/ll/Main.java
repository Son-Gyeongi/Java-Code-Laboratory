package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 6, 1));
    }
}

class Solution {
    public int solution(int a, int b, int c) {
        boolean option1 = a == b;
        boolean option2 = b == c;
        boolean option3 = c == a;

        if (option1 && option2) { // opiton3은 항상 true
            return (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c));
        } else if (option1 || option2 || option3) {
            return (a + b + c) * ((a * a) + (b * b) + (c * c));
        } else return a + b + c;
    }
}