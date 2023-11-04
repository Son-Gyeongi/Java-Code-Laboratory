package com.ll.date20231023;

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D4 완료 : 클래스와 메서드를 만들어서 처리
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
*/
public class Duck5 {
    public static void main(String[] args) {
        청둥오리5 a청둥오리 = new 청둥오리5();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리5 a흰오리 = new 흰오리5();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리5 a고무오리 = new 고무오리5();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

class 오리5 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

// 오리 => 부모 클래스
// 흰오리 => 자식 클래스
// 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다.
// "`흰오리`는 `오리`이다." 라고 자바에게 알려준다. (무조건!!)
// `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다. (무조건!!)
// 클래스와 객체는 명사이다.
// 메서드는 동사이다.
class 청둥오리5 extends 오리5 {

}

class 흰오리5 extends 오리5 {

}

/* 요구사항
- D5 완료 : 메서드 오버라이드를 사용해서 처리
 */
class 고무오리5 extends 오리5 {
    // 메서드 재정의 라고 합니다.
    // 메서드 오버라이드 라고도 합니다.
    // 메서드 재정의 => 부모가 물려준 능력을 다시 구현한다.
    @Override
    void 날다() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}
