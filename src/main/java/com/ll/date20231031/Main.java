package com.ll.date20231031;

public class Main {
    public static void main(String[] args) {
        // 강의자료 클래스를 복사한 강의자료1을 instance로 생성
        강의자료 강의자료1 = new 강의자료();
        강의자료1.제목 = "Java";
        강의자료1.내용 = "Java내용";
        강의자료1.저자 = "장동건";
        System.out.println("===== 강의자료1 =====");
        System.out.println("강의자료1.제목 : " + 강의자료1.제목);
        System.out.println("강의자료1.내용 : " + 강의자료1.내용);
        System.out.println("강의자료1.저자 : " + 강의자료1.저자);

        // 강의자료 클래스를 복사한 강의자료2를 instance로 생성
        강의자료 강의자료2 = new 강의자료();
        강의자료2.제목 = "JPA";
        강의자료2.내용 = "JPA내용";
        강의자료2.저자 = "원빈";
        System.out.println("===== 강의자료2 =====");
        System.out.println("강의자료2.제목 : " + 강의자료2.제목);
        System.out.println("강의자료2.내용 : " + 강의자료2.내용);
        System.out.println("강의자료2.저자 : " + 강의자료2.저자);

        System.out.println("===== 강의자료1 =====");
        System.out.println("강의자료1.제목 : " + 강의자료1.제목);
        System.out.println("강의자료1.내용 : " + 강의자료1.내용);
        System.out.println("강의자료1.저자 : " + 강의자료1.저자);

        System.out.println("===== 강의자료 =====");
//        System.out.println("강의자료.제목 : " + 강의자료.제목);
//        System.out.println("강의자료.내용 : " + 강의자료.내용);
        System.out.println("강의자료.저자 : " + 강의자료.저자);

        System.out.println("===== 자바 클래스 =====");
        System.out.println(Math.PI);
        System.out.println(Math.round(123.4567));
    }
}

class 강의자료 {
    String 제목;
    String 내용;
    static String 저자 = "박병규";
}
