package com.ll.date20231107;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class NullCheck {
    public static void main(String[] args) {
        PersonNull person = new PersonNull();

        // 개발을 하다보면 null이 나올 때가 있다.
        // grab() 호출까지 person,leftArm,hand가 null이 아닌지 체크해야 한다.
        // 실무코드에 이런게 많다. 왜냐하면 널에다 일 시키면 오류가 나서.
        if (person != null)
            if (person.leftArm != null) {
                if (person.leftArm.hand != null) {
                    person.leftArm.hand.grab(); // 왼팔에 달린 왼손으로 잡기
                }

        }

//        person.rightArm.hand.grab(); // 오른팔에 달린 오른손으로 잡기
    }
}

class PersonNull {
    public Arm leftArm;
    public Arm rightArm;

    public PersonNull() {
        this.leftArm = new Arm(); // 왼팔
        this.rightArm = new Arm(); // 오른팔
    }
}

class Arm {
    public Hand hand; // 손
    public Shoulder shoulder; // 어깨

    public Arm() {
        this.shoulder = new Shoulder();
        this.hand = new Hand();
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