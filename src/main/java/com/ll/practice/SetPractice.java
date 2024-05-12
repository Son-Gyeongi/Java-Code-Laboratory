package com.ll.practice;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        // 데이터 추가
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);
        set.add(3);

        // 반복자 생성 - while 문
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 반복자 생성 - for 문
        /*for (Integer integer : set) {
            System.out.println(integer);
        }*/

        /*
        Set의 요소를 하나씩 가져와서 배열에 넣는 것은 가능
         */
        Set<String> setStr = new HashSet<>();
        // Set에 요소 추가
        setStr.add("A");
        setStr.add("B");
        setStr.add("C");

        // Set의 크기만큼의 배열 생성
        String[] array = new String[setStr.size()];

        // Set의 요소를 배열에 복사
        setStr.toArray(array);
        System.out.println(Arrays.toString(array));

        // 배열 출력
        for (String element : array) {
            System.out.println(element);
        }
    }
}
