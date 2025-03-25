// 4주차 실습 문제 4번

package practice_problems;

import java.util.Scanner;

public class week4_4 {

    static class Dictionary {
        private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
        private static String[] eng = { "love", "baby", "money", "future", "hope" };

        public static void kor2Eng(String word) {
            Boolean ch = false;
            for (int i = 0; i < kor.length; i++) {
                if (word.equals(kor[i])) {
                    System.out.println(kor[i] + " : " + eng[i]);
                    ch = true;
                }
            }

            if (ch == false) {
                System.out.println(word + " : 저의 사전에 없습니다.");
            }
        }
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String words;
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            words = scanner.next();

            if (words.equals("그만")) {
                break;
            } else {
                Dictionary.kor2Eng(words);
            }
        }

        scanner.close();

    }

}
