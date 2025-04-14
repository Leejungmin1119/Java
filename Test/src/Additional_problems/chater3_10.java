
package Additional_problems;

import java.util.Scanner;

public class chater3_10 {
    public static void main(String[] args) {
        // 크기가 4인 차원 배열 생성
        // 임계값을 정하여 임계값보다 같거나 크면 255 작으면 0으로 설정후 출력

        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[4][4];

        // 입력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.printf("입계값 입력 : ");
        int ch_num = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] >= ch_num) {
                    arr[i][j] = 255;
                } else {
                    arr[i][j] = 0;

                }
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
        scanner.close();

    }

}
