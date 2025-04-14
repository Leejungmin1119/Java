package Additional_problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class chater3_17 {
    public static void main(String[] args) {
        // 양의 정수를 입력, 양의 정수가 아닌 문자열 및 음의 정수가 주어지면 ~ 제외 라는 문구 출력
        // -1을 입력받으면 종료, 평균은 ~~ 출력하기
        Scanner scanner = new Scanner(System.in);
        Boolean check = false;
        String menu[] = { "핫아메리카노", "아이스아메리카노", "카푸치노", "라떼" };
        int price[] = { 3000, 3500, 4000, 5000 };
        String order;
        int number;
        System.out.println("핫아메리카노 아이스아메리카노 카푸치노 라떼 있습니다~!");
        while (true) {
            try {
                check = false;
                order = scanner.next();
                if (order.equals("그만")) {
                    System.out.println("좋은 하루보내십시요~");
                    return;
                }

                number = scanner.nextInt();
                for (int i = 0; i < 4; i++) {
                    if (order.equals(menu[i])) {
                        System.out.printf("%s: %d 의 가격은 총 %d 입니다~!\n", menu[i], number, number * price[i]);
                        check = true;
                    }

                }
                if (check == false) {
                    System.out.println(order + ": 주문에 없는 메뉴입니다~!");
                }

            } catch (InputMismatchException e) {
                String b = scanner.nextLine();
                System.out.println("수량을 잘못입력하셧습니다~!");
            }
        }

    }

}
/*
 * 개선점
 * 
 * 1.Boolean을 이용한 풀이(지저분함)
 * - 메서드를 선언하여 좀더 알아보기 쉽게 변경하기
 * 2. Map 함수 사용하기
 * - 배열을 두개 사용하는거 보다 map 사용하는게 좀더 간결하고 보기좋음.
 * 
 * 개선된 코드 (map 반영 안됨)
 * 
 * import java.util.*;
 * 
 * public class CafeOrder {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * String[] menu = { "핫아메리카노", "아이스아메리카노", "카푸치노", "라떼" };
 * int[] price = { 3000, 3500, 4000, 5000 };
 * 
 * System.out.println("핫아메리카노 아이스아메리카노 카푸치노 라떼 있습니다~!");
 * 
 * while (true) {
 * try {
 * String order = scanner.next();
 * if (order.equals("그만")) {
 * System.out.println("좋은 하루보내십시요~");
 * break;
 * }
 * 
 * int number = scanner.nextInt();
 * 
 * // 결과 처리만 메서드에서 하고, 없으면 바로 출력
 * if (!processOrder(order, number, menu, price)) {
 * System.out.println(order + ": 주문에 없는 메뉴입니다~!");
 * }
 * 
 * } catch (InputMismatchException e) {
 * scanner.nextLine();
 * System.out.println("수량을 잘못입력하셧습니다~!");
 * }
 * }
 * }
 * 
 * // 주문 처리하는 메서드
 * public static boolean processOrder(String order, int number, String[] menu,
 * int[] price) {
 * for (int i = 0; i < menu.length; i++) {
 * if (order.equals(menu[i])) {
 * System.out.printf("%s: %d의 가격은 총 %d입니다~!\n", menu[i], number, number *
 * price[i]);
 * return true;
 * }
 * }
 * return false; // 못 찾았을 경우
 * }
 * }
 * 
 */

/*
 * 약 60분 소요.
 * 예외 처리 부분 이해 필요.
 */