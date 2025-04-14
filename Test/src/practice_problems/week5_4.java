package practice_problems;

import java.util.Scanner;

public class week5_4 {
    public static void main(String[] args) {
        StackApp.run();
    }
}

interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴

    int capacity(); // 스택의 전체 저장 가능한 개수 리턴

    String pop(); // 스택의 톱(top)에 저장된 실수 리턴

    boolean push(String val); // 스택의 톱(top)에 실수 저장
}

class StringStack implements Stack {

    int len;
    String arr[];
    int save_arr = 0;

    public StringStack(int len) {
        this.len = len;
        this.arr = new String[len];
    }

    public int length() {
        return save_arr;
    }

    public int capacity() {
        return len - length();
    }

    public boolean push(String val) {
        if (capacity() == 0) {
            return false;
        } else {
            arr[save_arr++] = val;
            return true;
        }
    }

    public String pop() {
        return arr[--save_arr];
    }
}

class StackApp {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String ans;
        // 클래스 선언
        StringStack stringStack = new StringStack(scanner.nextInt());

        while (true) {
            ans = scanner.next();

            // 그만 입력시
            if (ans.equals("그만")) {
                System.out.printf("스택에 저장된 모든 문자열 팝 :");
                while (stringStack.length() > 0) {
                    System.out.printf(" %s", stringStack.pop());
                }
                break;
            }

            // false == 스택이 꽉참
            else if (!stringStack.push(ans)) {
                System.out.println("스택이 꽉 차서 푸시 불과!");
            }
        }

    }
}
