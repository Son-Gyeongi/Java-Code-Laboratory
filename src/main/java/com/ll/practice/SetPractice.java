package com.ll.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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
    }
}
