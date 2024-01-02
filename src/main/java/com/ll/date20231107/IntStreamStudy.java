package com.ll.date20231107;

import java.util.stream.IntStream;

public class IntStreamStudy {
    public static void main(String[] args) {
        System.out.println("== v1 ==");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("== v2 ==");
        // 스트림화하면 소스코드가 좀 더 보기가 좋아지고
        // 만들기도 쉬워진다. 짧아진다.
        // rangeClosed(1, 10) : 1~10까지 10개 요소 / range(1, 10) : 1~9까지
        // .forEach : 종단함수, 스트림이 끝난다. 1개 요소씩 실행된다. / .collect()의 일종이다.
        IntStream.rangeClosed(1, 10)
                .forEach((int i) -> {
                    System.out.println(i);
                }); // 람다표현식

        System.out.println("== v3 ==");
        IntStream.rangeClosed(1, 10)
                .forEach((i) -> {
                    System.out.println(i);
                });

        System.out.println("== v4 =="); // i 괄호 생략 가능
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    System.out.println(i);
                });

        System.out.println("== v5 ==");
        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.println(i));

        System.out.println("== v6-1 == 1부터 10까지 출력");
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);

        System.out.println("== v6-2 == 2만 출력");
        IntStream.rangeClosed(1, 10)
                .filter(i -> i == 2)
                .forEach(System.out::println);

        System.out.println("== v6-2-1 == 2의 배수만 출력");
        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        // map 들어오는 녀석을 변환
        System.out.println("== v6-3 == map 들어오는 녀석을 변환");
        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 10)
                .forEach(System.out::println);

        // mapToObj 들어오는 타입 일반타입 IntStream, 나가는 객체타입 Stream<String>
        System.out.println("== v6-4 == mapToObj 들어오는 타입(IntStream)와 나가는 타입(Stream<String>) 다를 때");
        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 10)
                .mapToObj(i -> i + "점")
                .forEach(System.out::println);

        // 기본적으로 map을 쓴다
        // mapTo타입은 일반 타입에서 객체타입으로 바뀔때 쓰면 된다.
        System.out.println("== v6-5 ==");
        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 10)
                .mapToObj(i -> i + "점")
                .map(s -> "[" + s + "]")
                .forEach(System.out::println);

        // 스타일 따라 다름 이렇게 합쳐서 쓰시는 분들도 있다.
        System.out.println("== v6-6 ==");
        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> "[" + i * 10 + "점]")
                .forEach(System.out::println);
    }
}
