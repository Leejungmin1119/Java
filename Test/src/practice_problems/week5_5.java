package practice_problems;

import java.util.Scanner;

public class week5_5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 값 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String type = scanner.next();

        // 연산자에 따른 처리 수행
        if (type.equals("+")) {
            Add num = new Add(a, b);

            System.out.println(num.calculate());

        } else if (type.equals("-")) {
            Mul num = new Mul(a, b);
            System.out.println(num.calculate());
        } else if (type.equals("*")) {
            Sub num = new Sub(a, b);
            System.out.println(num.calculate());
        } else if (type.equals("/")) {
            Div num = new Div(a, b);
            if (b == 0) {
                System.out.println("계산할 수 없습니다.");

                scanner.close();
                return;
            }
            System.out.println(num.calculate());
        } else {
            System.out.println("잘못된 연산자입니다.");
        }

        scanner.close();
    }
}

// 추상 클래스 선언
abstract class Calc {

    int a, b;

    // 슈퍼 생성자
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 추상 메소드
    abstract int calculate();

}

class Add extends Calc {

    public Add(int a, int b) {
        super(a, b);
    }

    // 추상 클래스 구체화(+)
    int calculate() {
        return a + b;
    }
}

class Mul extends Calc {

    public Mul(int a, int b) {
        super(a, b);
    }

    // 추상 클래스 구체화(-)
    int calculate() {
        return a - b;
    }

}

class Sub extends Calc {

    public Sub(int a, int b) {
        super(a, b);
    }

    // 추상 클래스 구체화(*)
    int calculate() {
        return a * b;
    }

}

class Div extends Calc {

    public Div(int a, int b) {
        super(a, b);
    }

    // 추상 클래스 구체화(/)
    int calculate() {
        return a / b;
    }

}
