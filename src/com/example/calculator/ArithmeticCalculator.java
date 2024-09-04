package com.example.calculator;

public class ArithmeticCalculator {
    public double calculate(double firstNumber, double secondNumber,String operator) {
        return OperatorType.from(operator)
                .calculate(firstNumber, secondNumber);
    }


}
