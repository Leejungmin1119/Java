// Object 클래스알아보기
// Object 클래스는 모든 클래스에 강제로 상속이 됨.

package study_java.pakages;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
}

public class Objects {
    // 메서드
    public static void print(Object obj) {
        // 이미 강제로 상속이 되어있음으로, 딱히 선언할 필요가 없음. 그냥 사용가능
        System.out.println(obj.getClass().getName());// 클래스 이름
        System.out.println(obj.hashCode());// 해시코드
        System.out.println(obj.toString());// 문자열로 출력하기
        System.out.println(obj);// 출력
    }

    public static void main(String[] args) {
        Point p = new Point(2, 3);
        print(p);
    }

}
