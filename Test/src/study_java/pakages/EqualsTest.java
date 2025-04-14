// equals 클래스 사용 및 오버라이딩(+다운 캐스팅)

package study_java.pakages;

public class EqualsTest {

    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(3, 2);
        if (a.equals(b)) {
            System.out.println("true");
        } else if (b.equals(c)) {
            System.out.println("true");
        }

    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public boolean equals(Object obj) {
        Point p = (Point) obj;

        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }

    }
}
