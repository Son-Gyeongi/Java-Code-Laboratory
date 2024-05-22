package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        String[] spell = {"s", "o", "m", "d"};
        String[] spell = {"z", "d", "x"};
//        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        System.out.println(s.solution(spell, dic));
    }
}

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        // dic 배열에 spell 배열의 길이와 다른 거는 거르기
        String[] filteredDic = Arrays.stream(dic).filter(d -> d.length() == spell.length).toArray(String[]::new);
        if (filteredDic.length == 0) return 2;

        // filteredDic 원소마다 spell 각 원소 다 있는지 확인하기
        for (int i = 0; i < filteredDic.length; i++) {
            int count = 0;
            for (int j = 0; j < spell.length; j++) {
                if (filteredDic[i].contains(spell[j])) count += 1;
            }

            answer += (count == spell.length) ? 1 : 0;
        }

        return answer > 0 ? 1 : 2;
    }
}