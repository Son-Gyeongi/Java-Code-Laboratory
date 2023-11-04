package com.ll.practice;

public class WarriorConstructor {
    public static void main(String[] args) {
        전사Con a전사 = new 전사Con();
        a전사.이름 = "카니";
        a전사.나이 = 122;
        a전사.a무기 = new 칼Con();
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.나이 = 123;
        a전사.a무기 = new 활Con();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사Con {
    String 이름;
    int 나이;
    무기Con a무기;

    void 공격() {
        a무기.작동(this.이름, this.나이);
    }
}

// 무기Con은 객체생성(new)로 쓰려고 만든 게 아니라 기준점으로 만든거다.
// 그래서 abstract 안 빼도 된다.
abstract class 무기Con {
    String 무기명;
    
    void 작동(String 이름, int 나이) {
        System.out.println(나이 + "살 전사 " + 이름 + "(이)가 " + 무기명 + "(으)로 공격합니다.");
    }
}

class 칼Con extends 무기Con {

    // 칼Con 생성자
    칼Con() {
        무기명 = "칼";
    }
}

class 활Con extends 무기Con {
    
    // 활Con 생성자
    활Con() {
        무기명 = "활";
    }
}