package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    static int count = 0;
    private static final List<Double> calResult = new ArrayList<Double>();

    public double calculate(double firstNumber, double secondNumber,String operator) {

        double opResult = OperatorType.from(operator)
                .calculate(firstNumber, secondNumber);



        if(count<3){
            calResult.add(opResult);
            count++;
            System.out.println(count);
        }else{
            calResult.remove(0);
            calResult.add(opResult);
        }


        return opResult;
    }


    public static String calResult() {
        return calResult.toString();
    }


}
