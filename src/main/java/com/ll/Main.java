package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(999997));
    }
}

class Solution {
    public int solution(int n) {
        // 제곱근을 정수로 변환하여 계산
        System.out.println(Math.sqrt(n));
        System.out.println(Math.pow(Math.sqrt(n), 2));
        System.out.println(n == Math.pow(Math.sqrt(n), 2));
        System.out.println((int) Math.sqrt(n));
        int sqrt = (int) Math.sqrt(n);
        System.out.println(Math.pow(sqrt, 2));
        return n == sqrt * sqrt ? 1 : 2;
    }
}

//class Solution {
//    public double solution(int n) {
//        // 제곱근 메서드를 거듭제곱 메서드 안에 넣기
//        System.out.println(Math.sqrt(n));
//        System.out.println(Math.pow(Math.sqrt(n), 2));
//        System.out.println(n == Math.pow(Math.sqrt(n), 2));
//        double sqrt = Math.sqrt(n);
//        System.out.println(sqrt*sqrt);
//        return sqrt*sqrt == Math.pow(Math.sqrt(n), 2) ? 1 : 2;
//    }
//}