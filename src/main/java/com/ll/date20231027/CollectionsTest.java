package com.ll.date20231027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsTest {
    public static void main(String[] args) {  // 메인 함수 시작
        System.out.println("== List ==");
        List<Integer> ages = new ArrayList<>();

        // 데이터 넣을 때는 편하다.(자동라벨링)
        ages.add(10); // 철수나이
        ages.add(20); // 영희나이
        ages.add(30); // 영수나이
        ages.add(1, 40); // 철희나이
        ages.remove(0); // 철수 나이 삭제

        // 데이터 가져올 때는 불편하다.(라벨(index, 번호)가 어떻게 바뀔 지 모르기 때문)
        System.out.println("철수 나이 : " + ages.get(0)); // 철희나이는 최종적으로 0번(index)에 저장되어 있음

        System.out.println("== Map ==");

        // 데이터 넣을 때는 불편하다.(수동라벨링)
        Map<String, Integer> agesMap = new HashMap<>();
        agesMap.put("철수", 10);
        agesMap.put("영희", 20);
        agesMap.put("영수", 30);
        agesMap.put("철희", 40);

        agesMap.remove("철수");
        agesMap.get("영수");

        // 데이터 가져올 때는 편하다.(라벨(index, 번호)가 절대 안바뀜)
        System.out.println("철희나이 : " + agesMap.get("철희"));
    }
}
