package com.ll.date20231023;

// 문제 : 아래가 실행되도록 해주세요.
// 자바 28강 보기
public class Weapon3 {
    public static void main(String[] args) {
        무기3 a무기 = new 칼3();
        // 칼 리모콘이 무기 리모콘으로 변환
        a무기.공격(); // 그래서 무기리모콘에 공격이 없어서 오류가 난다.
        // 출력 : 칼로 공격합니다.
    }
}

/*
첫번째 문제점 :
무기3 a무기 = new 칼3();
// 칼 리모콘이 무기 리모콘으로 변환 (메서드 1개에서 -> 메서드 0개가 된다.)
a무기.공격(); // 그래서 무기리모콘에 공격이 없어서 오류가 난다.

class 무기3 {

}

class 칼3 extends 무기3 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }
}

 */

// 추상 클래스
abstract class 무기3 { // abstract는 new 무기3()로 객체를 생성 못한다.
    // 추상 메서드
    abstract void 공격(); // 리모콘 버튼용이니깐 건들지 말라고 abstract 붙여준다.
}

class 칼3 extends 무기3 {
    // 메서드 재정의 시 하위클래스 메서드가 우선권이 있따.
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }
}