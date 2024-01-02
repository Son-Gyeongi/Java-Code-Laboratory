package com.ll.date20231023;
// 시험 10/24일 아침에
// 30번 반복해서 적어보자, 외우거나 이해하거나 5분안에 작성할 수 있도록하자.
// 이 문제는 빠르게 풀 수 잇어야 한다. 많이 반복해서 풀어봐야한다 이해 못하더라도 다른 문제를 봤을 때
// 풀 수 있어야 한다.
// 중요한 건 이해가 아니라 빠르게 만드는 거다. 숙달되게 해보자.

// 1. 문제 : 전사객체가 마지막 자신의 이름과 공격방식을 기억하게 해주세요.
// 2. 문제 : 아래 코드에서 중복을 제거해주세요.
// 힌트 : 이거는 구성으로 푸는것 입니다.
public class Warrior {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립(이)가 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.
    }
}

/**
 * 변수 2개
 * 메서드 2개
 * this 리모콘 1개
 * 총 5개 멤버가 있다.
 */
class 전사 {
    // 멤버 변수, 인스턴스 변수는 장기 기억, 기억할 수 있게 변수 선언
    // 객체가 사라질 때까지 남는다.
    String lastAttacker;
    String lastWeaponName;

    // 지역변수는 단기 기억
    // 함수가 실행 시 생성되고 함수 종료시 삭제된다.
    void 공격(String attackerName, String weaponName) {
        // this.는 생략 가능, this를 통해서 멤버간 소통이 가능하다.
        this.lastAttacker = attackerName;
        this.lastWeaponName = weaponName;

        공격문구출력(attackerName, weaponName); // 변수가 아니라 값이다.
    }

    void 재공격() {
        공격문구출력(this.lastAttacker, this.lastWeaponName); // 변수가 아니라 값이다.
    }

    void 공격문구출력(String attackerName, String weaponName) {
        System.out.println(attackerName + "(이)가 " + weaponName + "(으)로 공격합니다.");
    }
}
