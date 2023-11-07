package com.ll.date20231107;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional_Study {
    public static void main(String[] args) {
        PersonOp person1 = new PersonOp(1, "bob");

        // List의 개수 : 0 ~ N 개
        List<PersonOp> personList = new ArrayList<>() { // 익명클래스
            { // 생성자 / 사람person1은 한명이지만 사람 리모콘은 3개이다.
                add(person1); // this. 생략
//                add(person1);
//                add(person1);
            }
        };
        // 리스트 데이터 가져오기
        // 데이터 가져올 때 숫자 필요
        PersonOp personOfIndex0 = personList.get(0);
        try {
            PersonOp personOfIndex1 = personList.get(1);
        } catch (IndexOutOfBoundsException ignored) {
        }

        // Optional의 개수  : 0 ~ 1 개, 1개 이상이 나올 수 없다.
        Optional<PersonOp> personOp = Optional.of(person1);
        // Optional 데이터 가져오기
        // 데이터 가져올 때 숫자 필요 없음
        PersonOp personOfOptional = personOp.get();

        // 데이터의 개수가 0개인 옵셔널 객체 생성
        // ofNullable() : null을 확실하게 넣을 때 사용
        Optional<PersonOp> personOp2 = Optional.ofNullable(null);
//        personOp2.get(); // 데이터가 없기 때문에 get()하면 안된다.
        try {
            personOp2.get();
        } catch (NoSuchElementException ignored) {
        }
    }
}

class PersonOp {
    private int id;
    private String name;

    public PersonOp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}