package com.example.calculator;

import java.util.Arrays;
import java.util.function.BinaryOperator;




public enum OperatorType {

    ADD("+", (firstNumber, secondNumber) -> firstNumber + secondNumber),
    SUBTRACT("-", (firstNumber, secondNumber) -> firstNumber - secondNumber),
    MULTIPLY("*", (firstNumber, secondNumber) -> firstNumber * secondNumber),
    DIVIDE("/", (firstNumber, secondNumber) -> {

        // 나누기 0 처리
        if (secondNumber == 0) {
            System.out.println("0으로 나눌수 없습니다.");


        }
        return firstNumber / secondNumber;

//        try {
//            return firstNumber / secondNumber;
//
//            // 0으로 나눴을때 예외처리
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌수 없습니다.");
//
//        }
//
//
//        return firstNumber / secondNumber;
    });

    private final String operator;
    private final BinaryOperator<Double> expression;

    OperatorType(String operator, BinaryOperator<Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    // 연산자 잘못 썼을때
    public static OperatorType from(String operator) {
        return Arrays.stream(OperatorType.values())
                .filter(type -> type.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 연산자가 아닙니다."));
    }

    public double calculate(double firstNumber, double secondNumber) {
        return expression.apply(firstNumber, secondNumber);
    }
}

