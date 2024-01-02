package com.ll.date20231024;

// 조건 : 전사의 공격 메서드에서는 System.out.println 사용 금지
// 조건 : 칼을 사용할 때는, 칼의 `작동` 메서드에서 System.out.println 으로 출력
// 조건 : 활을 사용할 때는, 활의 `작동` 메서드에서 System.out.println 으로 출력
// 조건 : v1이 쉬우신 분은 v2로 도전
public class Warrior24 {
    public static void main(String[] args) {
        전사24 a전사 = new 전사24();
        a전사.이름 = "카니";
        a전사.나이 = 22;
        a전사.a무기 = new 무기24();
        a전사.공격24();
        // 출력v1 : 전사가 칼로 공격합니다.
        // 출력v2 : 22살 전사 카니님이 칼로 공격합니다.

        a전사.이름 = "초코";
        a전사.a무기 = new 무기24();
        a전사.공격24();
        // 출력v1 : 전사가 활로 공격합니다.
        // 출력v2 : 22살 전사 초코님이 활로 공격합니다.
    }
}

class 무기24 {
    void 출력(String name, int num) {

    }
}

class 칼24 extends 무기24 {
    void 출력(String name, int num) {
        System.out.println(num + "살 전사 " + name + "님이 칼로 공격합니다.");
    }
}

class 활24 extends 무기24 {
    void 출력(String name, int num) {
        System.out.println(num + "살 전사 " + name + "님이 활로 공격합니다.");
    }
}

class 전사24 {
    String 이름;
    int 나이;
    무기24 a무기;

    void 공격24() {
        a무기.출력(이름, 나이);
    }
}