package com.ll.practice;

// date20231015
public class WarriorTest2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 = 22;
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 공격() {
        a무기.작동(this.이름, this.나이);
    }
}

abstract class 무기 {
    abstract void 작동(String 이름, int 나이);
}

class 칼 extends 무기 {
    void 작동(String 이름, int 나이) {
        System.out.println(나이 + "살 전사 " + 이름 + "(이)가 칼(으)로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 작동(String 이름, int 나이) {
        System.out.println(나이 + "살 전사 " + 이름 + "(이)가 활(으)로 공격합니다.");
    }
}