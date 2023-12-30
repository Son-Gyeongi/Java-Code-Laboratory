package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(999));
    }
}

class Solution {
    public int solution(int hp) {
        int answer = 0;

        // 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력
        if (hp / 5 > 0) {
            answer = hp / 5;
            hp %= 5;
        }
        if (hp / 3 > 0) {
            answer += (hp / 3);
            hp %= 3;
        }
        answer += hp;

        return answer;
    }
}