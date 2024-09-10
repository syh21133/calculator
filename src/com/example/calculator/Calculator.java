package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    static int count = 0;
    private static final List<Integer> calResult = new ArrayList<Integer>();

    public static void main(String[] args) {

    }

    public static String calResult() {
        return calResult.toString();
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String Cal(int a, int b, String c) {
        String answer = "";


        // 계산하기
        switch (c) {
            case "+":
                answer = a + " " + c + " " + b + " = " + (a + b);
                Calculator.addResult(a + b);

            case "-":
                answer = a + " " + c + " " + b + " = " + (a - b);
                Calculator.addResult(a - b);

            case "*":
                answer = a + " " + c + " " + b + " = " + (a * b);
                Calculator.addResult(a * b);

            case "/":

                try {

                    answer = a + " " + c + " " + b + " = " + (a / b);
                    Calculator.addResult(a / b);
                    // 0으로 나눴을때 예외처리
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌수 없습니다.");

                }


            default:
                System.out.println("잘못 입력 하셨습니다.");

        }
        return answer;


    }


    // 계산결과 저장
    public static void addResult(int cal) {
        if (count < 3) {
            calResult.add(cal);
            count++;
        } else {
            calResult.remove(0);
            calResult.add(cal);
        }


    }

    // 계산결과 조회
    public List<Integer> printResult() {

        return calResult;
    }

    public double calculate(String operator, double firstNumber, double secondNumber) {
        return OperatorType.from(operator)
                .calculate(firstNumber, secondNumber);
    }

}
