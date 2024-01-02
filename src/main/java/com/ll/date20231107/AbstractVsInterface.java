package com.ll.date20231107;

/**
 * - Abstract클래스, Interface 둘 다 new로 객체 생성 못한다.
 * - 애초에 둘 다 객체화해서 쓸거는 아니다. 묶어주는 용도로 쓴다.
 * - 구현된 메서드가 없어서
 */
public class AbstractVsInterface {
    public static void main(String[] args) {
        new Hong2().공격();
        new Hong2().방어();
        new Hong2().heal();
        new Hong2().talk();
    }
}

// 사용방법
class Hong2 extends Player implements Doctor2 {

    @Override
    public void 방어() {
        System.out.println("방어");
    }

    @Override
    public void heal() {
        System.out.println("치료");
    }

    @Override
    public void talk() {
        System.out.println("대화");
    }
}

// Player 추상 클래스는 순도 50%의 추상 클래스이다.
abstract class Player {
    public void 공격() {
        System.out.println("공격");
    }

    public abstract void 방어();
}

// 인터페이스는 100% 추상메서드로만 구성되어야 한다.
interface Doctor2 {
    void heal();

    void talk();
}
