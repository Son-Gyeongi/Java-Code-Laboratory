package com.ll.practice;

// 문제 : 생성자를 이용해서 무기 계열 클래스들에 있는 중복 제거
public class WarriorDuplication {
    public static void main(String[] args) {
        전사Dup a전사 = new 전사Dup();
        a전사.이름 = "카니";
        a전사.나이 = 122;
        a전사.a무기 = new 칼Dup(); // 생성자에서 값을 미리 초기화한다.
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.나이 = 123;
        a전사.a무기 = new 활Dup();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사Dup {
    String 이름;
    int 나이;
    무기Dup a무기;

    void 공격() {
        a무기.작동(이름, 나이);
    }
}

abstract class 무기Dup {
    String 무기명;
    void 작동(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "(이)가 " + 무기명 + "(으)로 공격합니다.");
    }
}

class 칼Dup extends 무기Dup {
    칼Dup() {
        무기명 = "칼";
    }
}

class 활Dup extends 무기Dup {
    활Dup() {
        무기명 = "활";
    }
}
