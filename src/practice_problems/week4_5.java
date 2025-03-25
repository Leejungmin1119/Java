package practice_problems;

import java.util.Scanner;

public class week4_5 {
    static class Calculate {
        int a, b;

        public Calculate(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int Add() {
            return a + b;
        }

        int Sub() {
            return a - b;
        }

        int Mul() {
            return a * b;

        }

        int Div() {
            return a / b;
        }
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // 값 입력
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String symbol = scanner.next();

        // 클래스 선언
        Calculate calculate = new Calculate(a, b);

        if (symbol.equals("+")) {
            System.out.println(calculate.Add());
        } else if (symbol.equals("-")) {
            System.out.println(calculate.Sub());
        } else if (symbol.equals("*")) {
            System.out.println(calculate.Mul());
        } else if (symbol.equals("/")) {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(calculate.Div());
            }
        }

        else {
            System.out.println("해당하는 연산이 없습니다.");
        }
        scanner.close();
    }

}
