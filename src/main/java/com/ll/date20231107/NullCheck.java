package com.ll.date20231107;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class NullCheck {
    public static void main(String[] args) {
        /*
        PersonNull person = new PersonNull();
        // Optional 들어오기 전 세상, 코드를 믿을 수 없다.
        // 개발을 하다보면 null이 나올 때가 있다.
        // grab() 호출까지 person,leftArm,hand가 null이 아닌지 체크해야 한다.
        // 실무코드에 이런게 많다. 왜냐하면 널에다 일 시키면 오류가 나서.
        if (person != null)
            if (person.leftArm != null) {
                if (person.leftArm.hand != null) {
                    person.leftArm.hand.grab(); // 왼팔에 달린 왼손으로 잡기
                }
        }
         */

        Optional<PersonNull> personOp = Optional.ofNullable(new PersonNull());

        // 지금 기억해야할 거
        //Optional에는 여러가지 장치가 있다.
        PersonNull person1 = personOp.get(); // get()은 데이터가 없으면 뻗어버린다.
        PersonNull person2 = personOp.orElse(null);
        // orElse(null); 는 데이터가 없으면 오류를 내뿜는 대신에 null을 준다.

        // Optional 쓰다보면 자연스럽게 익혀질거다.
        // getLeftArm, getHand, grab 다 Optional이면 flatMap()을 이어서 stream처럼 쓸 수 있다.
        personOp
                .flatMap(PersonNull::getLeftArm)
                .flatMap(Arm::getHand)
                .ifPresent(Hand::grab);
        // Person클래스에 팔이 있고 Arm클래스에 손이 있다면 이 hand가 존재한다면
        // Hand클래스 안에 있는 grab을 실행시켜라. 라는 뜻이다.

        // 외우자. Optional로 만들어 놓으면 여러가지 장치들이 있어서
        // 코드량을 줄 일 수 있다.
        // Optional을 잘 모르겠다면 쓰지 마라. 가끔가다 보이면 이런거구나 생각하자.
    }
}

class PersonNull {
    private Optional<Arm> leftArm;
    private Optional<Arm> rightArm;

    public PersonNull() {
//        this.leftArm = new Arm(); // 왼팔
//        this.rightArm = new Arm(); // 오른팔

        // Optional로 감싸고 값을 넣을 때 ofNullable() 사용
        // Optional.of는 잊고 무조건 ofNullable로 써라
        this.leftArm = Optional.ofNullable(new Arm()); // 옵셔널 안에 만든거다.
        this.rightArm = Optional.ofNullable(new Arm());
    }

    public Optional<Arm> getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Optional<Arm> leftArm) {
        this.leftArm = leftArm;
    }

    public Optional<Arm> getRightArm() {
        return rightArm;
    }

    public void setRightArm(Optional<Arm> rightArm) {
        this.rightArm = rightArm;
    }
}

class Arm {
    private Optional<Hand> hand; // 손
    private Optional<Shoulder> shoulder; // 어깨

    public Arm() {
//        this.shoulder = new Shoulder();
//        this.hand = new Hand();

        this.shoulder = Optional.ofNullable(new Shoulder());
        this.hand = Optional.ofNullable(new Hand());
    }

    public Optional<Hand> getHand() {
        return hand;
    }

    public void setHand(Optional<Hand> hand) {
        this.hand = hand;
    }

    public Optional<Shoulder> getShoulder() {
        return shoulder;
    }

    public void setShoulder(Optional<Shoulder> shoulder) {
        this.shoulder = shoulder;
    }
}

class Shoulder {

}

class Hand {
    // 손의 집는 기능
    public void grab() {
        System.out.println("Grabbing");
    }
}