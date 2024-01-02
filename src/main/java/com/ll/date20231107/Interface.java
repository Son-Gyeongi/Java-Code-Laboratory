package com.ll.date20231107;

/**
 * 다중 상속 해결 -> 인터페이스
 */
public class Interface {
    public static void main(String[] args) {
        new Hong1().say();
    }
}

class Person1 {
    void say() {
        System.out.println("Person say");
    }
}

// 불완전한 메서드(구현이 안된)는 자식클래스에서 무조건 오버라이드 해야한다.
interface Doctor1 {
    // 인터페이스는 무조건 추상클래스밖에 못쓴다.
    public abstract void say(); // public abstract 생략

    public abstract void heal();
}

// 홍길동은 의사이기도 하고 사람이다.
// 홍의 부모는 Person, Dorcotr
class Hong1 extends Person1 implements Doctor1 {

    // 이렇게 오버라이드를 하면 다중상속 문제가 해결이 될 수 있다.
    @Override
    public void say() {
        // 다만 아래와 같은 코드가 또 문제가 될 수 있다.
        super.say(); // 누구의 say()를 호출해야 할까요? Person 이 정답입니다,
        // Doctor 과 Programmer 는 say 가 추상메서드 입니다.
    }

    @Override
    public void heal() {

    }
}