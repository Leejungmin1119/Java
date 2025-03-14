import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();

        String op = scanner.next();

        float num2 = scanner.nextFloat();

        if (op.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (op.equals(("-"))) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        } else if (op.equals(("*"))) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        } else if (op.equals(("/"))) {
            if (num1 == 0 || num2 == 0) {
                System.out.println("False");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }
        scanner.close();
    }

}
// 오류 발생지점
/*
 * 1. 입출력 문제
 * 2. 띄어쓰기 문제
 */