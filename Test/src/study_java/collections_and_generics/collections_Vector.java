package study_java.collections_and_generics;

import java.util.Vector;

public class collections_Vector {
    // point 클래스만 다루는 Vector<Point> 컬렉션 활용

    public static void main(String[] args) {
        Vector<Point> p = new Vector<Point>();

        p.add(new Point(2, 3));
        p.add(new Point(-5, 20));
        p.add(new Point(30, -8));

        p.remove(1);

        for (Point point : p) // 항상된 for-each문
        {
            System.out.println(point);
        }

        for (int i = 0; i < 2; i++) {
            Point pp = p.get(i);
            System.out.println(pp);
        }
    }

}

class Point {
    int x;
    int y;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;

    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", y, x);
    }
}
