package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(s.solution(friends, gifts));
    }
}

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        // 선물 준 사람과 그에 따른 선물 받은 사람 리스트 저장
        Map<String, Map<String, Integer>> giveGiftList = new HashMap<>();
        Map<String, Integer> giveFriends = new HashMap<>(); // 선물 준 사람, 선물 준 횟수
        Map<String, Integer> takeFriends = new HashMap<>(); // 선물 받은 사람, 선물 받은 횟수
        for (int i=0;i<gifts.length;i++) {
            String giveFriend = gifts[i].split(" ")[0];
            String takeFriend = gifts[i].split(" ")[1];

            giveFriends.put(giveFriend, giveFriends.getOrDefault(giveFriend, 0) + 1);
            takeFriends.put(takeFriend, takeFriends.getOrDefault(takeFriend, 0) + 1);

            giveGiftList.putIfAbsent(giveFriend, new HashMap<>());
            giveGiftList.get(giveFriend).put(takeFriend,
                    giveGiftList.get(giveFriend).getOrDefault(takeFriend, 0) + 1);
        }
        System.out.println(giveFriends);
        System.out.println(takeFriends);
        System.out.println(giveGiftList);

        // 선물 지수 저장
        Map<String, Integer> giftPoint = new HashMap<>();
        for (int i=0;i<friends.length;i++) {
            int giveCount = giveFriends.getOrDefault(friends[i], 0);
            int takeCount = takeFriends.getOrDefault(friends[i], 0);

            giftPoint.put(friends[i], giveCount-takeCount);
        }
        System.out.println(giftPoint);


        for (int i=0;i<friends.length-1;i++) {
            String A = friends[i];

            for (int j=0;j<friends.length-1;j++) {
                String B = friends[j];

                // 서로에게 한명이라도 선물을 준 적 있는지 확인
                if (giveGiftList.contains(A).contains(B) ||
                        giveGiftList.contains(B).contains(A)) {
                    System.out.println("dfdf");
                }
            }
        }

        return answer;
    }
}