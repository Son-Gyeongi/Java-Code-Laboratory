package com.ll.date20231023;

/* 요구사항
// 아래와 같이 출력되도록 해주세요.
// 중복이 없어야 합니다.
*/
public class Duck8 {
    public static void main(String[] args) {
        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다(); // 고무계열 방식
        // 출력 : 저는 못 날아요 ㅠㅠ
        a로봇오리.수영하다(); // 오리 방식
        // 출력 : 물갈퀴로 수영합니다.
    }
}

class 오리8 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }

    void 수영하다() {
        System.out.println("물갈퀴로 수영합니다.");
    }
}

class 고무오리8 extends 오리8 {
    void 날다() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }

    void 수영하다() {
        System.out.println("물에 둥둥 뜹니다.");
    }
}

class 로봇오리 extends 오리8 {
    // 상속만으로는 완벽한 중복제거가 불가능한 상황이 옵니다. 즉 실패
    void 날다() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }

    // 힌트 : 상속말고 구성으로 해결해야 한다.
    // 상속만으로는 복잡한 문제를 풀 수 없다.
}