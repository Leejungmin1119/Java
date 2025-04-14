package Additional_problems;

import java.util.Scanner;

public class chater4_9 {
    static public class GuessGame {

        public static void game(Player player[]) {
            Scanner scanner = new Scanner(System.in);

            int guessNumber;
            int index = 0;
            int min = 101;
            int hiddenAnswer = (int) (Math.random() * 100 + 1);

            System.out.println("숫자가 결정되었습니다~!! 맞추어 보실까요?");

            for (int i = 0; i < player.length; i++) {
                System.out.println(player[i].name + ": ");
                guessNumber = scanner.nextInt();

                player[i].diff = Math.abs(hiddenAnswer - guessNumber);
                if (player[i].diff < min) {
                    min = player[i].diff;
                    index = i;
                }

            }

            System.out.println("정답은 " + hiddenAnswer + ".");
            System.out.println(player[index].name + "이 이겼습니다 승정 1점 확보!");
            player[index].point++;

        }

    }

    public static void main(String[] args) {
        // 숨겨진 숫자에 가장 가까이 다가간 사람이 이기는 게임,
        // 1~100까지의 랜덤 정수 한개 생성후 숫자 맞추기
        // 참여할 사람을 설정후 이기면 승점 1 추가 , 한판 끝날때마다 계속할껀지
        // 문구 출력하기 그만하고 싶다면 no 입력받고 승자의 이름을 출력후 끝내기.

        Scanner scanner = new Scanner(System.in);

        int number;
        String name;
        String ch;
        System.out.println("***예측 게임을 시작합니다.***");
        System.out.println("게임에 참여할 선수 수 : ");
        number = scanner.nextInt();

        Player player[] = new Player[number];

        for (int i = 0; i < number; i++) {
            System.out.println("선수 이름 : ");
            name = scanner.next();
            player[i] = new Player(name);
        }
        do {

            GuessGame.game(player);
            System.out.println("계속할려면 yes 그만둘려면 no");
            ch = scanner.next();

        } while (ch.equals("yes"));

        int max = 0;
        int index = 0;
        for (int i = 0; i < number; i++) {

            System.out.printf("%s : %d", player[i].name, player[i].point);

            if (player[i].point > max) {
                max = player[i].point;
                index = i;
            }

        }
        System.out.println("");
        System.out.printf("%s 가 최종승리하였습니다..!", player[index].name, player[index].point);

        scanner.close();

    }

}

class Player {
    String name;
    int point;
    int diff;

    public Player(String name) {
        this.name = name;
        this.point = 0;
        this.diff = 0;
    }

}
