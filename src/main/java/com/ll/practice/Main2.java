//package com.ll.practice;
//
//public class Main2 {
//    public static void main(String[] args) {
//        com.ll.로봇오리 a로봇오리 = new com.ll.로봇오리();
//        a로봇오리.날다();
//        // 출력 : 저는 못 날아요 ㅠㅠ
//        a로봇오리.수영하다();
//        // 출력 : 물갈퀴로 수영합니다.
//    }
//}
//
//class 오리 {
//    int fly = 1;
//    int swim = 1;
//
//    void 날다() {
//        if (fly == 1) {
//            System.out.println("오리가 날개로 날아갑니다.");
//        } else {
//            System.out.println("저는 못 날아요 ㅠㅠ");
//        }
//    }
//
//    void 수영하다() {
//        if (swim == 1) {
//            System.out.println("물갈퀴로 수영합니다.");
//        } else {
//            System.out.println("물에 둥둥 뜹니다.");
//        }
//    }
//}
//
//class 고무오리 extends com.ll.오리 {
//    고무오리() {
//        fly = 0;
//        swim = 0;
//    }
//}
//
//class 로봇오리 extends com.ll.오리 {
//    로봇오리() { // 생성자
//        fly = 0;
//        swim = 1;
//    }
//}
