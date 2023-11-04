package com.ll.date20231027;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        System.out.println("==List==");

        ArrayList<Integer> age = new ArrayList<>();

        age.add(10); // 철수 나이
        age.add(20); // 영희 나이
        age.add(30); // 민수 나이
        age.add(40); // 철희 나이

        for (int a : age) {
            System.out.println(a);
        }

        System.out.println("-----------------");

        age.remove(2);

        for (int a : age) {
            System.out.println(a);
        }

        System.out.println("-----------------");

        age.add(1, 50);

        for (int a : age) {
            System.out.println(a);
        }
    }
}
