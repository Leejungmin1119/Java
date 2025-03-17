package class_folder;

public class class_constructor {

    public static class circle {
        int radious;
        String name;

        // 생성자 선언, 동일한 이름을 가짐짐
        public circle(int r, String n) {
            radious = r;
            name = n;

        }

        public circle(int r) {
            radious = r;
            name = "몰라";

        }
    }

    // ------------------------------------------------------------
    // 인스턴스 변수
    int check;
    int check1;

    // public class class_constructor 이용
    public class_constructor(int a, int b) {
        check = a + 1;
        check1 = b + 1;
    }

    public static void main(String args[]) {

        // 호출과 동시에 생성자로 인한 초기화 실행
        circle my = new circle(3, "circles");
        // 출력
        System.out.println(my.radious + " " + my.name);
        class_constructor hy = new class_constructor(3, 4);

        // 출력
        System.out.println(hy.check + hy.check1);

    }
}

/*
 * 
 * 생성자
 * 
 * - 동일한 이름을 가짐
 * - 실행후 한번만 동작함
 * - 객체를 초기화 시키는 기능을 지님
 * - 타입이 다르다면 여러개의 생성자를 만들어 줄 수 있음
 * 
 * - 생성자는 기본적으로 모든 클래스에 들어가 있어야 하며 클래스에 아무런 정보가 없으면
 * 기본 생성자 가 생성되어 아무일도 일어나지 않고 리턴하게 된다.
 */
