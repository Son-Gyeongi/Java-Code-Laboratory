package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String str = "banana";
        String str = "abracadabra";
//        String str = "aaabbaccccabba";
        System.out.println(s.solution(str));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;

        // '첫 글자 x' 와 'x가 아닌 글자'를 센다.
        // '첫 글자 x 개수'와 'x가 아닌 글자 개수'가 같으면 분리

        answer = divide(s);

        return answer;
    }

    public int divide(String s) {
        if (s.equals("")) return 0;
        else if (s.length() == 1) return 1;

        int sum = 1;
        String[] strArr = s.split("");

        // 1. 첫 글자와 개수 찾기
        String firstStr = ""; // 첫 문자열 x
        int firstCount = 0; // 첫 문자열 x 개수
        for (int i=0;i<strArr.length;i++) {
            firstStr = strArr[0];

            if (!strArr[0].equals(strArr[i])) break;

            firstCount++;
        }

        // 2. 첫 글자 이후에 나오는 글자와 비교하기
        int diffCount = 0;
        for (int i=firstCount;i<strArr.length;i++) {
            if (!firstStr.equals(strArr[i])) diffCount++;
            else firstCount++;

            if (firstCount == diffCount) {
                break;
            }
        }

        return sum + divide(s.substring(firstCount+diffCount));
    }
}