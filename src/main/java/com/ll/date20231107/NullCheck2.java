package com.ll.date20231107;

import java.util.Optional;

public class NullCheck2 {
    public static void main(String[] args) {
        // Not Optional
        System.out.println("== Not Optional ==");
        PersonNull2 person1 = new PersonNull2();
        boolean isHandNull = true;

        if (person1 != null)
            if (person1.getLeftArm() != null) {
                if (person1.getLeftArm().getHand() != null) {
                    isHandNull = false;
                    person1.getLeftArm().getHand().grab(); // 왼팔에 달린 왼손으로 잡기
                }
            }

        if (isHandNull) {
            System.out.println("hand is null");
        }

        // Optional, v1
        System.out.println("== Optional, v1 ==");
        Optional<PersonNull2> person2 = Optional.ofNullable(null);

        // map은 안에 구성요소를 실행, Optional은 person2안에 객체가 있으면 실행한다.
        person2
                .map(p -> p.getLeftArm()) // Arm2 Optional로 바뀜, 결과가 있으면 실행, person2 안에 있는 **Person 객체**를 꺼내서 getLeftArm()을 실행,
                .map(arm -> arm.getHand()) // Hand2 Optional로 바뀜, 결과가 있으면 실행, **arm 객체**를 꺼내서 getHand()를 실행, 없으면 실행안됨.
                .ifPresentOrElse(
                        hand -> hand.grab(), // 결과가 있으면 실행
                        () -> System.out.println("hand is null") // 첫번째 p, 두번째 arm, 세번째 hand가 null 이면 실행
                );

        // Optional, v2
        System.out.println("== Optional, v2 ==");
        Optional<PersonNull2> person3 = Optional.ofNullable(new PersonNull2());

        person3
                .map(PersonNull2::getLeftArm) // person2 안에 있는 Person 객체를 꺼내서 getLeftArm()을 실행,
                .map(Arm2::getHand) // arm 객체를 꺼내서 getHand()를 실행, 없으면 실행안됨.
                .ifPresentOrElse(
                        Hand2::grab,
                        () -> System.out.println("hand is null")
                );
    }
}

class PersonNull2 {
    private Arm2 leftArm;
    private Arm2 rightArm;

    public PersonNull2() {
        this.leftArm = new Arm2(); // 왼팔
        this.rightArm = new Arm2(); // 오른팔
    }

    public Arm2 getLeftArm() {
        return leftArm;
    }

    public Arm2 getRightArm() {
        return rightArm;
    }
}

class Arm2 {
    private Hand2 hand; // 손
    private Shoulder2 shoulder; // 어깨

    public Arm2() {
        this.shoulder = new Shoulder2();
        this.hand = new Hand2();
    }

    public Hand2 getHand() {
        return hand;
    }

    public Shoulder2 getShoulder() {
        return shoulder;
    }
}

class Shoulder2 {

}

class Hand2 {
    // 손의 집는 기능
    public void grab() {
        System.out.println("Grabbing");
    }
}