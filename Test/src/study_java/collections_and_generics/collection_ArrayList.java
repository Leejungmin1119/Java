package study_java.collections_and_generics;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_ArrayList {
    public static void main(String[] args) {

        // 컬렉션 활용 2. 리스트 사용
        // 가장 이름이 긴사람을 출력하는 문제.
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> s = new ArrayList<String>();

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.printf("이름을 입력하세요. : ");
            s.add(scanner.next());

        }
        int longname = 0;
        for (int i = 0; i < s.size(); i++) {
            // 이름 비교
            if (s.get(longname).length() < s.get(i).length()) {

                longname = i;
            }
        }
        System.out.printf("가장 기이이이이이인 사라라라ㄹㅏㅁ은? : ");
        System.out.println(s.get(longname));

        scanner.close();
    }

}
