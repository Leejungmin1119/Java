package Additional_problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class chater3_16 {
    public static void main(String[] args) {
        // 양의 정수를 입력, 양의 정수가 아닌 문자열 및 음의 정수가 주어지면 ~ 제외 라는 문구 출력
        // -1을 입력받으면 종료, 평균은 ~~ 출력하기
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int ans = 0;
        int index = 0;
        while (true) {
            try {
                num = scanner.nextInt();
                if (num == -1) {
                    break;
                } else if (num < 0) {
                    System.out.println(num + "제외");
                } else {
                    ans += num;
                    index++;
                }
            } catch (InputMismatchException e)// 객체 e에 에러 정보가 넘어옴
            {

                String b = scanner.nextLine();// 정보를 대신 받음
                System.out.println(b + "제외");

            }
        }

        System.out.println("평균은 : " + (ans / index));

    }

}
