package com.ll.date20231107;

/**
 * 다중 상속
 * 자바에서 다중상속을 막은 이유는 똑같은 형태의 메서드가 2개 이상
 * 존재할 가능성이 생기기 때문이고, 그걸 해결하는 것은 귀찮다.
 */
public class MultipleInheritance {
    public static void main(String[] args) {
//        new Hong.say();
    }
}

class Person {
    void say() {
    }
}

class Doctor {
    void say() {
    }
    void heal() {
    }
}

// 홍길동은 의사이기도 하고 사람이다.
/*
class Hong extends Person, Doctor { // 다중 상속
    void say() {
        super.say();
    }
}
 */