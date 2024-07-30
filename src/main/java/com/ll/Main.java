package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(s.solution(numbers, "right"));
    }
}

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        // String[] left = {"*", "7", "4", "1"};
        // String[] middle = {"0", "8", "5", "2"};
        // String[] right = {"#", "9", "6", "3"};
        String left = "*741";
        String middle = "0852";
        String right = "#963";

        int leftPoint = 0;
        int rightPoint = 0;

        for (int i=0;i<numbers.length;i++) {
            switch(numbers[i]) {
                case 1,4,7 :
                    leftPoint = numbers[i];
                    answer += "L";
                    break;
                case 3,6,9 :
                    rightPoint = numbers[i];
                    answer += "R";
                    break;
                case 2,5,8,0 :
                    int middleIdx = middle.indexOf(String.valueOf(numbers[i]));
                    int leftIdx = left.indexOf(String.valueOf(leftPoint)) == -1 ?
                            middle.indexOf(String.valueOf(leftPoint))
                            : left.indexOf(String.valueOf(leftPoint));
                    int rightIdx = right.indexOf(String.valueOf(rightPoint)) == -1 ?
                            middle.indexOf(String.valueOf(rightPoint))
                            : right.indexOf(String.valueOf(rightPoint));

                    System.out.print("leftPoint = " + leftPoint + "     ");
                    System.out.println("rightPoint = " + rightPoint);
                    System.out.print("middleIdx = " + middleIdx + "     ");
                    System.out.print("leftIdx = " + leftIdx + "     ");
                    System.out.println("rightIdx = " + rightIdx);

                    if (Math.abs(middleIdx - leftIdx)
                            == Math.abs(middleIdx - rightIdx)) {
                        if (hand == "right") {
                            rightPoint = numbers[i];
                            answer += "R";
                            System.out.println("오른손잡이");
                            break;
                        } else {
                            leftPoint = numbers[i];
                            answer += "L";
                            System.out.println("왼손잡이");
                            break;
                        }
                    } else if (Math.abs(middleIdx - leftIdx)
                            < Math.abs(middleIdx - rightIdx)) {
                        // 왼손에서 이동
                        leftPoint = numbers[i];
                        answer += "L";
                        System.out.println("왼손에서 이동");
                        break;
                    } else if (Math.abs(middleIdx - leftIdx)
                            > Math.abs(middleIdx - rightIdx)) {
                        // 오른손에서 이동
                        rightPoint = numbers[i];
                        answer += "R";
                        System.out.println("오른손에서 이동");
                        break;
                    }
            }
        }

        return answer;
    }
}