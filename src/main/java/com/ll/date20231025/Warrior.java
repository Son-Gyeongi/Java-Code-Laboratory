package com.ll.date20231025;

// 문제 : this("NoName"); 을 사용해서 생성자 위임을 해주세요.

public class Warrior {
    public static void main(String[] args) {
        전사 a전사1 = new 전사("카니");
        System.out.println(a전사1.이름); // 출력 : 카니
        System.out.println(a전사1.나이); // 출력 : 20

        전사 a전사2 = new 전사();
        System.out.println(a전사2.이름); // 출력 : NoName
        System.out.println(a전사2.나이); // 출력 : 20
    }
}

class 전사 {
    String 이름;
    int 나이;

    // 생성자
    전사() {
        this("noName");
    }

    전사(String 이름) {
        this.이름 = 이름;
        this.나이 = 20;
    }
}