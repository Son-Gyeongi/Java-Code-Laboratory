package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
//        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
//        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
//        String[] friends = {"a", "b", "c"};
//        String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
        System.out.println(s.solution(friends, gifts));
    }
}

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> nextMonthGifts = new HashMap<>();

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
        System.out.println("giveFriends = " + giveFriends);
        System.out.println("takeFriends = " + takeFriends);
        System.out.println("giveGiftList = " + giveGiftList);

        // 선물 지수 저장
        Map<String, Integer> giftPoint = new HashMap<>();
        for (int i=0;i<friends.length;i++) {
            int giveCount = giveFriends.getOrDefault(friends[i], 0);
            int takeCount = takeFriends.getOrDefault(friends[i], 0);

            giftPoint.put(friends[i], giveCount-takeCount);
        }
        System.out.println("giftPoint = " + giftPoint);



        System.out.println("nextMonthGifts = " + nextMonthGifts);

        // nextMonthGifts에서 제일 큰 숫자 찾아서 리턴
        for (String key : nextMonthGifts.keySet()) {
            answer = Math.max(nextMonthGifts.get(key), answer);
        }

        return answer;
    }

    // 많이 선물한 사람이 다음달에 선물 한 개 더 받음
    public void gaveMoreGifts(String person, Map<String, Integer> nextMonthGifts) {
        System.out.println("gaveMoreGifts = "+person);
        nextMonthGifts.put(person, nextMonthGifts.getOrDefault(person, 0) + 1);
    }
    public void gaveMoreGifts(Map<String, Map<String, Integer>> giveGiftList, String A, String B, Map<String, Integer> nextMonthGifts) {
        // 선물 준 개수
        int giveA = giveGiftList.containsKey(A) ? giveGiftList.get(A).getOrDefault(B, 0) : 0;
        int giveB = giveGiftList.containsKey(B) ? giveGiftList.get(B).getOrDefault(A, 0) : 0;

        if (giveA > giveB) nextMonthGifts.put(A, nextMonthGifts.getOrDefault(A, 0) + 1);
    }

    // 선물 지수 계산
    public void giftPointCal(Map<String, Integer> giftPoint, String A, String B, Map<String, Integer> nextMonthGifts) {
        System.out.println("giftPointCal = "+A);
        System.out.println("giftPointCal = "+B);

        // 선물 지수
        int giftPointA = giftPoint.get(A);
        int giftPointB = giftPoint.get(B);

        if (giftPointA > giftPointB) nextMonthGifts.put(A, nextMonthGifts.getOrDefault(A, 0) + 1);
        else if (giftPointA < giftPointB) nextMonthGifts.put(B, nextMonthGifts.getOrDefault(B, 0) + 1);
    }
}