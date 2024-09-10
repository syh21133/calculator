package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArithmeticCalculator {

    static int count = 0;
    private static final List<Double> calResult = new ArrayList<Double>();
    Stream<double[]> stream;

    public double calculate(double firstNumber, double secondNumber, String operator) {

        // 계산하기
        double opResult = OperatorType.from(operator)
                .calculate(firstNumber, secondNumber);


        // 값 저장하기
        if (!Double.isInfinite(opResult)) {
            if (count < 5) {
                calResult.add(opResult);
                count++;
                System.out.println(count);
            } else {
                calResult.remove(0);
                calResult.add(opResult);
            }
        }


        return opResult;
    }

    // 입력값 받고 보다 큰 수 조회
    public static void calResult(Double check) {

        // 조회시 저장값 x
        if(calResult.isEmpty()){
            System.out.println("저장된 계산값이 없습니다.");
        }


        else {
            for (int i = 0; i < count; i++) {
                if (check <= calResult.get(i)) {
                    System.out.println(calResult.get(i));
                }

            }
        }

    }


}
