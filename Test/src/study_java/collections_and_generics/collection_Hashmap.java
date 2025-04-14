package study_java.collections_and_generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collection_Hashmap {
    public static void main(String[] args) {

        // 해쉬멥(딕셔너리) 활용 문제
        // 자바 과목의 이름과 점수 관리 문제

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> s = new HashMap<String, Integer>();

        for (int i = 0; i < 5; i++) {
            s.put(scanner.next(), scanner.nextInt());
        }

        System.out.println("들어간 총 갯수 : " + s.size());

        Set<String> keys = s.keySet();
        Iterator<String> val = keys.iterator();

        while (val.hasNext()) {
            String key = val.next(); // 현재 key
            int value = s.get(key); // 해당 key에 대한 value
            System.out.println("이름: " + key + ", 점수: " + value);
        }

        scanner.close();

        // ?

    }

}
