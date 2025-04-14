package Additional_problems;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class chater3_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[10];
        int index = 0;
        int ch[] = new int[10];
        for (int i = 0; i < 10; i++) {
            // 입력
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int number = 0;
            // 자리수 확인
            for (int j = arr[i]; j > 0; j /= 10) {
                number += j % 10;
            }

            if (number == 9) {
                ch[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.printf(" %d", ch[i]);
        }

        scanner.close();

    }

}

/*
 * 개선점:
 * 
 * 1. 불필요한 index제거 , ArrayList 사용하기 (리스트)
 * -그때그때마다 데이터가 늘어나니깐 index를 사용할 필요가 없음.
 * 
 * 
 * 개선된 코드 (리스트 사용)
 * 
 * import java.util.*;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * 
 * Scanner scanner = new Scanner(System.in);
 * int arr[] = new int[10];
 * List<Integer> ch = new ArrayList<>();
 * 
 * for (int i = 0; i < 10; i++) {
 * arr[i] = scanner.nextInt();
 * }
 * 
 * for (int i = 0; i < 10; i++) {
 * int number = 0;
 * for (int j = arr[i]; j > 0; j /= 10) {
 * number += j % 10;
 * }
 * 
 * if (number == 9) {
 * ch.add(arr[i]); // index 변수 없이 add로 저장
 * }
 * }
 * 
 * for (int num : ch) {
 * System.out.printf(" %d", num);
 * }
 * 
 * scanner.close();
 * }
 * }
 */
