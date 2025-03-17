// 객체 배열

package class_folder;

public class class_objectarray {

    // 클래스
    public static class circle {
        int radious = 1;
        String name = "";
    }

    public static void main(String[] args) {
        // 객체 배열선언
        circle[] n = new circle[5];

        // 아직 참조만 된 상태이기에 직접 for문을 통하여 선언필요.
        for (int i = 0; i < 5; i++) {
            // 선언
            n[i] = new circle();
        }

    }

}

/*
 * 객체 배열
 * 
 * - 참조변수 선언시에 배열의 크기를 바로 지정 x new circle[] 에다가 넣어야 함.
 * 
 * - 위 작업을 해도 아직 참조된거지 선언된 것은 아님 직접 선언필요.
 * 
 * 
 */
