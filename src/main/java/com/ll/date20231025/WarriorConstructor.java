package com.ll.date20231025;

public class WarriorConstructor {
    public static void main(String[] args) {
        전사C a전사 = new 전사C();
        a전사.이름 = "카니";
        a전사.나이 = 122;
        a전사.a무기 = new 칼C(); // 생성자로 칼C 초기화
        a전사.공격C();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.나이 = 123;
        a전사.a무기 = new 활C(); // 생성자로 활C 초기화
        a전사.공격C();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사C {
    String 이름;
    int 나이;
    무기C a무기;

    void 공격C() {
        a무기.작동C(이름, 나이);
    }
}

abstract class 무기C {
    String 무기명;

    void 작동C(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "(이)가 " + 무기명 + "(으)로 공격합니다.");
    }
}

class 칼C extends 무기C {
    칼C() {
        무기명 = "칼";
    }
}

class 활C extends 무기C {
    활C() {
        무기명 = "활";
    }
}
