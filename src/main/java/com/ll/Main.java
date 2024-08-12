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
        // 이번 달까지 선물을 주고받은 기록을 바탕으로 다음 달에 누가 선물을 많이 받을지 예측

        // 두 사람 사이에 더 많은 선물을 준 사람이 다음 달에 선물을 하나 받습니다.
        // 두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면,
        // 선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받습니다.
        // **선물 지수는 이번 달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값입니다.
        // 만약 두 사람의 선물 지수도 같다면 다음 달에 선물을 주고받지 않습니다.

        // 친구들의 이름을 담은 1차원 문자열 배열 friends
        // 이번 달까지 친구들이 주고받은 선물 기록을 담은 1차원 문자열 배열 gifts

        // 다음달에 가장 많은 선물을 받는 친구가 받을 선물의 수를 return
        // - 다음달에 받는 선물 예측하기

        Map<String, Integer> giveFriends = new HashMap<>(); // 선물 준 사람, 선물 준 횟수
        Map<String, Integer> takeFriends = new HashMap<>(); // 선물 받은 사람, 선물 받은 횟수
        Map<String, Integer> giftDiff = new HashMap<>(); // 각 사용자의 선물 지수
        Map<String, Map<String, Integer>> giveGiftList = new HashMap<>(); // 선물 준 사람, 선물 받은 사람들
        Map<String, Integer> monthGiftList = new HashMap<>(); // 다음달에 선물 받을 사람, 선물 받은 횟수

        for (int i=0;i<gifts.length;i++) {
            String friend = gifts[i].split(" ")[0];
            String gift = gifts[i].split(" ")[1];

            int friendValue = giveFriends.getOrDefault(friend, 0);
            int giftValue = takeFriends.getOrDefault(gift, 0);

            // 선물 준 사람
            giveFriends.put(friend, friendValue + 1);

            // 선물 주고 받은 사람 명단들
            giveGiftList.putIfAbsent(friend, new HashMap<>());
            int giftNameValue = giveGiftList.get(friend).getOrDefault(gift, 0);
            giveGiftList.get(friend).put(gift, giftNameValue + 1);


            // 선물 받은 사람
            takeFriends.put(gift, giftValue + 1);
        }
        System.out.println(giveFriends);
        System.out.println(takeFriends);
        System.out.println(giveGiftList);

        // 선물 지수 계산
        for (int i=0;i<friends.length;i++) {
            int give = giveFriends.getOrDefault(friends[i], 0);
            int take = takeFriends.getOrDefault(friends[i], 0);

            giftDiff.put(friends[i], give-take);
        }
        System.out.println(giftDiff);

        for (int i=0;i<friends.length-1;i++) {
            String A = friends[i];
            for (int j=i+1;j<friends.length;j++) {
                String B = friends[j];

                // A가 선물을 준 적 있는지 확인
                if (giveGiftList.containsKey(A)) {
                    // A가 B에게 선물 준 적 있는지 확인 - A와 B 비교

                    // 1. 주고 받은 경우
                    // 일단 선물 준 사람이랑 뭔가 있어야 함 - 두 사람 중에 많이 준 사람이 다음달에 받음
                    if (giveGiftList.get(A).containsKey(B)) {
                        giveAndTake(giveGiftList, A, B, monthGiftList);
                    } else if (giveGiftList.get(B).containsKey(A)) {
                        // A가 B에게 선물 준 적이 없다.
                        // B도 A에게 준 적이 없는지 학인
                        giveAndTake(giveGiftList, B, A, monthGiftList);
                    } else {
                        // 3. 주고 받지 않은 경우

                    }
                }
            }
        }

        System.out.println("monthGiftList = "+monthGiftList);

        int answer = 0;
        return answer;
    }

    public void giveAndTake(Map<String, Map<String, Integer>> giveGiftList, String A, String B, Map<String, Integer> monthGiftList) {
        int tempGiftValue = giveGiftList.get(A).getOrDefault(B, 0);
        int tempGiftValue2 = giveGiftList.containsKey(B) ?
                giveGiftList.get(B).getOrDefault(A, 0) : 0;

        // 2. 주고 받은 경우 - 주고 받은 수가 같은 경우
        // 일단 선물 준 사람이랑 뭔가 있어야 함 - 두 사람 중에 선물 지수가 큰 사람이 1개 받음
        // 만약 두 사람의 선물 지수도 같다면 다음 달에 선물을 주고받지 않습니다.
        if (tempGiftValue == tempGiftValue2) {
            return;
        } else if (tempGiftValue > tempGiftValue2) {
            // A가 B보다 선물을 더 많이 줌
            int giftDiffValue = monthGiftList.getOrDefault(A, 0);

            monthGiftList.put(A, giftDiffValue + 1);
        } else {
            // B가 A보다 선물을 더 많이 줌
            int giftDiffValue = monthGiftList.getOrDefault(B, 0);

            monthGiftList.put(B, giftDiffValue + 1);
        }
    }
}