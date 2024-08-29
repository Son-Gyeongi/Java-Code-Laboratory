package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] people = {70, 50, 80, 50};
//        int[] people = {70, 80, 50};
        System.out.println(s.solution(people, 100));
    }
}

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int i = 0, j = people.length -1;

        while (i  <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            answer++;
        }

        return answer;
    }
}