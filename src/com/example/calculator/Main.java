package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 필수 과제 쿨래스 사용 x
//        Scanner scanner = new Scanner(System.in);
//        Boolean exit = true;
//
//
//        while(exit) {
//            System.out.print("첫 번째 숫자 입력 : ");
//            int first = scanner.nextInt();
//            System.out.print("사칙연산 기호 입력 : ");
//            String operator = scanner.next();
//            System.out.print("두 번째 숫자 입력 : ");
//            int second = scanner.nextInt();
//
//            if (first >= 0 && second >= 0) {
//
//
//                switch (operator) {
//                    // 덧셈
//                    case "+":
//                        System.out.println(first + " " + operator + " " + second + " = " + (first + second));
//                        break;
//                    // 뺄셈
//                    case "-":
//                        System.out.println(first + " " + operator + " " + second + " = " + (first - second));
//                        break;
//                    // 곱셈
//                    case "*":
//                        System.out.println(first + " " + operator + " " + second + " = " + first * second);
//                        break;
//                    // 나눗셈
//                    case "/":
//                        try {
//
//                            System.out.println(first + " " + operator + " " + second + " = " + first / second);
//                            break;
//
//                            // 0으로 나눴을때 예외처리
//                        } catch (ArithmeticException e) {
//                            System.out.println("0으로 나눌수 없습니다.");
//
//                        }
//                        break;
//                    default:
//                        System.out.println("잘못 입력 하셨습니다.");
//                }
//                System.out.println("계산기를 종료하시겠습니까?(exit입력 시 종료)");
//                String answer = scanner.next();
//
//                if (answer.equals("exit")) {
//                    System.out.println("계산기를 종료합니다.");
//                    exit = false;
//                } else {
//                    continue;
//                }
//            }else{
//                System.out.println("잘못 입력 하셨습니다.");
//
//            }
//
//
//        }


        Calculator calc = new Calculator();
        ArithmeticCalculator aCalc = new ArithmeticCalculator();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;


        while (exit) {


            System.out.println("1.계산 2.조회 3.종료 ");
            int num = scanner.nextInt();

            switch (num) {


                case 1:
                    System.out.print("첫 번째 숫자 입력 : ");
//          int first = scanner.nextInt();
                    double first = scanner.nextDouble();
                    System.out.print("사칙연산 기호 입력 : ");
                    String operator = scanner.next();
                    System.out.print("두 번째 숫자 입력 : ");
//          int second = scanner.nextInt();
                    double second = scanner.nextDouble();

                    if (first >= 0 && second >= 0) {

//                System.out.println(calc.Cal(first, second, operator));
//
//                System.out.println("저장된 계산값 : "+Calculator.calResult());

                        double opResult = aCalc.calculate(first, second, operator);

                        if (!Double.isInfinite(opResult)) {
                            System.out.println(first + " " + operator + " " + second + " = " + opResult);

                        }
                    }
                    break;

                case 2:
                    System.out.println("저장된 계산값 중 입력 값보다 큰 수 조회 ");
                    Double check = scanner.nextDouble();
                    aCalc.calResult(check);
                    break;

                case 3:
                    System.out.println("계산기를 종료합니다.");
                    exit = false;
                    break;


                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
            }

        }


    }
}