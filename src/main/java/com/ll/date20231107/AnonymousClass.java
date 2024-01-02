package com.ll.date20231107;

/**
 * 추상 메서드 때문에 객체생성이 안되는 경우는, new 와 함께
 * 해당 추상메서드를 즉석에서 구현한다면(익명 클래스) 객체생성 가능
 */
public class AnonymousClass {
    public static void main(String[] args) {
        Player3 player = new Player3() {
            // 익명 클래스
            @Override
            public void 방어() {
                System.out.println("방어");
            }
        };

        player.공격();
        player.방어();

        Doctor3 doctor = new Doctor3() {
            @Override
            public void heal() {
                System.out.println("치료");
            }

            @Override
            public void talk() {
                System.out.println("대화");
            }
        };

        doctor.heal();
        doctor.talk();
    }
}

// Player 추상 클래스는 순도 50%의 추상 클래스이다.
abstract class Player3 {
    public void 공격() {
        System.out.println("공격");
    }

    public abstract void 방어();
}

// 인터페이스는 100% 추상메서드로만 구성되어야 한다.
interface Doctor3 {
    void heal();

    void talk();
}
