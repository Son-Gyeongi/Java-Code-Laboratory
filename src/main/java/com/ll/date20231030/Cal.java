package com.ll.date20231030;

/**
 * # 공통목표
 * - 재귀를 이용해서 풀어주세요.
 *
 * - 1단계
 *     - 목표 : Calc.run("3 * 1") == 3
 * - 2단계
 *     - 목표 : Calc.run("3 * 1 + (1 - 1)") == 3
 * - 3단계
 *     - 목표 : Calc.run("3 * 1 + (1 - (4 * 1 - (1 - 1)))") == 0
 */
public class Cal {
    public static int run(String exp) { // exp , expression 식
        String[] expBits = exp.split(" ");
        String operand1 = expBits[0];
        String operator = expBits[1];
        String operand2 = expBits[2];

        int a = Integer.parseInt(operand1);
        int b = Integer.parseInt(operand2);

        return switch (operator) {
            case "*" -> a * b;
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            default -> 0;
        };

        /*
        위에 switch랑 같다.
        if (operator.equals("*")) {
            return a * b;
        } else if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("/")) {
            return a / b;
        }

        return 0;
         */
    }
}
