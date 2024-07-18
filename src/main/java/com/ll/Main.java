package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String dartResult = "1S2D*3T";
//        String dartResult = "10D10S0D";
        String dartResult = "0D4S0D";
//        String dartResult = "1D2S0T";
        System.out.println(s.solution(dartResult));
    }
}

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] scores = new String[3]; // 계산해야할 점수 넣기

        // S는 점수의 1제곱, D는 점수의 2제곱, T는 점수의 3제곱
        // * 은 이전 점수와, 현재 점수 각각 2배 (첫번째 점수에서 * 나올 시 2개 가능)
        // # 이 나오면 -1을 점수에 곱하기
        // 그러면 먼저 S,D,T를 계산 그 다음 * 계산, 그 다음 # 계산하고 합산하기

        String[] divide = dartResult.split(""); // 다트 관련 점수 모두 떨어뜨리기

        // 1. 점수에 S, D, T 가 있는지 확인하기
        int index = 0;
        for (int i=0;i<divide.length;i++) {
            if (divide[i].equals("S") || divide[i].equals("D") || divide[i].equals("T")) {
                // 처음 다트 던졌을 때 0일 경우 -> divide[i-1], divide[i-2] 인덱스 에러 난다. => 해결 i > 1 추가
                if (i > 1 && divide[i-1].equals("0") && divide[i-2].equals("1")) { // 점수가 10일 경우
                    scores[index++] = divide[i-2] + divide[i-1] + divide[i];
                } else scores[index++] = divide[i-1] + divide[i];
            }
        }

        System.out.println(Arrays.toString(scores));

        // 2. 점수에 * 있는지 확인하기
        for (int i=0;i<divide.length;i++) {

            // 마지막 다트의 경우
            if (i > 5 && divide[i].equals("*")) {
                scores[2] += "*";
                scores[1] += "*";
            } else if (i > 2 && divide[i].equals("*")) {
                scores[1] += "*";
                scores[0] += "*";
            } else if (divide[i].equals("*")) {
                scores[0] += "*";
            }
        }

        System.out.println(Arrays.toString(scores));

        // 3. 점수에 # 있는지 확인하기
        for (int i=0;i<divide.length;i++) {

            // 마지막 다트의 경우
            if (i > 5 && divide[i].equals("#")) {
                scores[2] += "#";
            } else if (i > 2 && divide[i].equals("#")) {
                scores[1] += "#";
            } else if (divide[i].equals("#")) {
                scores[0] += "#";
            }
        }

        System.out.println(Arrays.toString(scores));

        // 4. scores 배열보고 값 계산하기
        for (int i=0;i<scores.length;i++) {
            String[] scoreStr = scores[i].split("");
            System.out.println(Arrays.toString(scoreStr));
            // 10점일 경우
            int score = scoreStr[1].equals("0") ? 10 : Integer.parseInt(scoreStr[0]);

            int temp = 0; // answer에 저장하기 전 임시 점수
            // S는 점수의 1제곱, D는 점수의 2제곱, T는 점수의 3제곱
            if (scores[i].contains("S")) temp = (int) Math.pow(score, 1);
            else if (scores[i].contains("D")) temp = (int) Math.pow(score, 2);
            else if (scores[i].contains("T")) temp = (int) Math.pow(score, 3);

            System.out.println("temp = "+temp);

            // * 는 하나당 곱하기2
            if (scores[i].contains("**")) temp *= 4;
            else if (scores[i].contains("*")) temp *= 2;

            System.out.println("temp* = "+temp);

            // # 은 -1
            if (scores[i].contains("#")) temp *= (-1);

            System.out.println("temp# = "+temp);

            answer += temp;
        }

        return answer;
    }
}