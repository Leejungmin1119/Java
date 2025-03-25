package practice_problems;

import java.util.Scanner;

public class week4_3 {

    public static class Phone {
        // 사람의 정보
        String name;
        String number;

        public Phone(String name, String number) {
            this.name = name;
            this.number = number;
        }
    }

    public static class PhoneBook {

        int member;
        Scanner scanner = new Scanner(System.in);

        // 사람수 입력
        public PhoneBook() {
            this.member = scanner.nextInt();

            // 0보다 큰 수 받기
            while (member <= 0) {
                this.member = scanner.nextInt();
            }

        }

        public void run() {
            // 사람의 수 만큼 배열 생성
            Phone phone[] = new Phone[member];

            // 정보 입력 후 저장
            for (int i = 0; i < member; i++) {
                String name = scanner.next();
                String number = scanner.next();

                phone[i] = new Phone(name, number);
            }

            System.out.println("저장되었습니다...");

            // 찾기
            while (true) {
                String find_name = scanner.next();
                Boolean ch = false;
                if (find_name.equals("그만")) {
                    break;
                }

                else {
                    for (int i = 0; i < member; i++) {
                        if (find_name.equals(phone[i].name)) {
                            System.out.println(phone[i].name + "의 번호는 " + phone[i].number + " 입니다.");
                            ch = true;
                        }
                    }

                    if (ch == false) {
                        System.out.println(find_name + " 이 없습니다.");
                    }
                }
            }
        }

    }

    // 메인
    public static void main(String[] arg) {

        // 사람 인원수 입력받기
        PhoneBook phonebook = new PhoneBook();
        phonebook.run();
    }
}