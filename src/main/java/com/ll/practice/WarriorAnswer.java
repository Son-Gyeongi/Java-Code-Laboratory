package com.ll.practice;

// 시험 10/24일 아침에
// 30번 반복해서 적어보자, 외우거나 이해하거나 5분안에 작성할 수 있도록하자.
// 이 문제는 빠르게 풀 수 잇어야 한다. 많이 반복해서 풀어봐야한다 이해 못하더라도 다른 문제를 봤을 때
// 풀 수 있어야 한다.
// 중요한 건 이해가 아니라 빠르게 만드는 거다. 숙달되게 해보자.

// 문제 : 아래 코드에서 중복을 제거해주세요.
// 문제 : 전사객체가 마지막 자신의 이름과 공격방식을 기억하게 해주세요.
// 힌트 : 이거는 구성으로 푸는것 입니다.
public class WarriorAnswer { // A는 answer의 A를 의미
    public static void main(String[] args) {
        전사A a전사 = new 전사A();

        a전사.공격A("브라이언", "칼");
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.재공격A();
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.공격A("필립", "창");
        // 필립(이)가 창(으)로 공격합니다.

        a전사.공격A("마크", "지팡이");
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격A();
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격A();
        // 마크(이)가 지팡이(으)로 공격합니다.
    }
}


class 전사A {
    // 장기 기억
    String lastAttacker; // last 가장 마지막에 사용되었다는 의미
    String lastWeaponName;

    void 공격A(String attackerName, String weaponName) {
        this.lastAttacker = attackerName;
        this.lastWeaponName = weaponName;

        공격문구출력A(attackerName, weaponName);
    }

    void 재공격A() {
        공격문구출력A(this.lastAttacker, this.lastWeaponName);
    }

    void 공격문구출력A(String attackerName, String weaponName) {
        System.out.println(attackerName + "(이)가 " + weaponName + "(으)로 공격합니다.");
    }
}
