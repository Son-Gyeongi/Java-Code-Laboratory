package com.ll.date20231023;

public class Animal {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다(); // 출력 : 숨쉬다.
    }
}

class 동물 {
    void 숨쉬다() {
        System.out.println("숨쉬다.");
    }
}

class 사람 extends 동물 {
}
