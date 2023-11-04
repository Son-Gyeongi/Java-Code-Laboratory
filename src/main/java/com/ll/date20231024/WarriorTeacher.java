package com.ll.date20231024;

// 조건 : 전사의 공격 메서드에서는 System.out.println 사용 금지
// 조건 : 칼을 사용할 때는, 칼의 `작동` 메서드에서 System.out.println 으로 출력
// 조건 : 활을 사용할 때는, 활의 `작동` 메서드에서 System.out.println 으로 출력
// 조건 : v1이 쉬우신 분은 v2로 도전
public class WarriorTeacher {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 = 22;
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력v1 : 전사가 칼로 공격합니다.
        // 출력v2 : 22살 전사 카니님이 칼로 공격합니다.

        a전사.이름 = "초코";
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력v1 : 전사가 활로 공격합니다.
        // 출력v2 : 22살 전사 초코님이 활로 공격합니다.
    }
}

abstract class 무기 {
    /*
    이거는 리모콘 전용 메서드입니다.
    구현하지 마세요. 이런 메시지 안 적고
    abstract 적어주면 다른 개발자가 보기에 이해하기도 쉽다
     */

    abstract void 작동(String name, int num);
}

class 칼 extends 무기 {
    void 작동(String name, int num) {
        System.out.println(num+"살 전사 "+name+"님이 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 작동(String name, int num) {
        System.out.println(num+"살 전사 "+name+"님이 활로 공격합니다.");
    }
}

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 공격() {
        a무기.작동(이름, 나이); // this. 생략가능
    }
}