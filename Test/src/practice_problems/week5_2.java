package practice_problems;

import java.util.Scanner;

public class week5_2 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(); // BLACK 색에 (0,0) 위치의 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}

class Point {
    // 변수 선언
    private int x, y;

    // 위치 입력
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // private 변수를 꺼내기 위한 함수
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    String color;

    // 생성자
    public ColorPoint() {
        // 이러면 슈퍼클래스의 point(int x,int y) 쪽으로 이동
        super(0, 0);

        // 색깔지정
        color = "BLACK";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    // 메소드
    public void setXY(int x, int y) {
        // 값 이동
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }

}