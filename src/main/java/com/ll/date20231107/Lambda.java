package com.ll.date20231107;

public class Lambda {
    // 두번째 방법 : 클래스는 클래스 안에도 만들 수 있다.
    // 그때는 static을 붙여야 한다.
    public static class Hong4_2 implements Doctor4 {
        @Override
        public void heal(int hp) {
            System.out.println("Hong4_2 : heals " + hp + " hp");
        }
    }

    public static void main(String[] args) {
        // 첫번째 방법 : 정석
        Doctor4 doctor1 = new Hong4_1();

        doctor1.heal(100);

        // 두번째 방법 : 클래스는 클래스 안에도 만들 수 있다.
        Doctor4 doctor2 = new Hong4_2();

        doctor2.heal(100);

        // 세번째 방법 : 클래스를 main()메서드 안에 넣을 수 있다.
        // 이 클래스는 오직 자신이 만들어진 main()메서드 안에서만 쓸 수 있다.
        class Hong4_3 implements Doctor4 {
            @Override
            public void heal(int hp) {
                System.out.println("Hong4_3 : heals " + hp + " hp");
            }
        }
        Doctor4 doctor3 = new Hong4_3();

        doctor3.heal(100);

        // 네번째 방법 : 'class Hong4_4 implements'를 제거할 거다.
        // 익명 클래스
        Doctor4 doctor4 = new Doctor4() {
            @Override
            public void heal(int hp) {
                System.out.println("Hong4_4 : heals " + hp + " hp");
            }
        };

        doctor4.heal(100);

        // 다섯 번째 방법 : Doctor4 클래스의 메서드가 하나일 때 가능
        // 어차피 구현해야하는 메서드는 1개라서 heal을 생략
        Doctor4 doctor5 = (int hp) -> {
            System.out.println("Hong4_5 : heals " + hp + " hp");
        };

        doctor5.heal(100);

        // 여섯 번째 방법 : 구현할 메서드가 1개밖에 없을 때 hp가 int인 것을 알고 있다.
        // int 생략
        Doctor4 doctor6 = (hp) -> {
            System.out.println("Hong4_6 : heals " + hp + " hp");
        };

        doctor6.heal(100);

        // 일곱 번째 방법 : 실행해야 할 명령이 1개만 있어서 {}중괄호 생략
        // 만약에 return이 있다면 return도 생략가능
        // 무엇이든 한 줄이 있다면 생략 가능
        Doctor4 doctor7 = (hp) -> System.out.println("Hong4_7 : heals " + hp + " hp");

        doctor7.heal(100);

        // 여덟 번째 방법 : static void heal(int hp) {} 메서드 만들기
        Doctor4 doctor8 = (hp) -> heal(hp);

        doctor8.heal(100);

        // 여덟 번째 방법 v2 : 여덟 번째 방법에서 hp 인자랑 heal(hp)의 hp 인자랑
        // 갯수가 똑같고 그냥 넘겨주는 거일 때
        // Lambda::heal : Lambda 클래스 안에 있는 heal()메서드이다라는 뜻
        Doctor4 doctor8v2 = Lambda::heal;

        doctor8v2.heal(100);

        // 아홉 번째 방법 : 응용
        Doctor4 doctor9 = hp -> System.out.println(hp);

        doctor9.heal(100);

        // 아홉 번째 방법 v2 : 응용
        Doctor4 doctor9v2 = System.out::println;

        doctor9v2.heal(100);
    }

    // 여덟 번째 방법 : static void heal(int hp) {} 메서드 만들기
    static void heal(int hp) {
        System.out.println("Hong4_8 : heals " + hp + " hp");
    }
}

interface Doctor4 {
    void heal(int hp);
}

// 첫번째 방법 : 정석, 일반적인 방식
class Hong4_1 implements Doctor4 { // Hong4 is Doctor4
    @Override
    public void heal(int hp) {
        System.out.println("Hong4_1 : heals " + hp + " hp");
    }
}