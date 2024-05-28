package com.ll;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("3x + 7 + x"));
        System.out.println(s.solution("x + x + x"));
        System.out.println(s.solution(	"1 + 3 + 4"));
    }
}

class Solution {
    public String solution(String polynomial) {
        String answer = "";

        String[] strPol = polynomial.split(" \\+ "); // 더하기 이스케이프하기

        int linearTerm = 0;
        int constant = 0;
        for (int i=0;i<strPol.length;i++) {
            if (strPol[i].contains("x")) {
                String[] xSpl = strPol[i].split("x");
                if (xSpl.length == 0) linearTerm += 1;
                else linearTerm += Integer.parseInt(xSpl[0]);
            } else {
                constant += Integer.parseInt(strPol[i]);
            }
        }

        if (linearTerm == 0) answer += constant;
        else if (linearTerm == 1) answer = constant == 0 ? "x" : "x + " +constant;
        else if (constant == 0) answer = linearTerm + "x";
        else answer = linearTerm + "x + " + constant;

        return answer;
    }
}