package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {4, 1, 2, 1};
        System.out.println(s.solution(numbers, 4));
    }
}

class Solution {
    public int solution(int[] numbers, int target) {
        return new NumberOfCases(numbers, target).calc();
    }
}

class NumberOfCases {
    private int[] numbers;
    private int target;

    public NumberOfCases(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }

    public int calc() {
        return calc(0, 0, "");
    }

    public int calc(int depth, int sum, String history) {
        System.out.print(history); // 재귀함수의 history를 보자, history는 빼도 됨

        if (depth == numbers.length) {
            System.out.print(sum == target ? " [성공]" : " [실패]");
        }

        System.out.println();

        if (depth == numbers.length) return sum == target ? 1 : 0;

        // 현재 내가 있는 지점에서 플러스 한 버전과 마이너스 한 버전
        return calc(depth + 1, sum + numbers[depth], history + " + " + numbers[depth])
                + calc(depth + 1, sum - numbers[depth], history + " - " + numbers[depth]);
    }
}