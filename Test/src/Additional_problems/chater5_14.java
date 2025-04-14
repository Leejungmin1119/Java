package Additional_problems;

public class chater5_14 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rect = new Rect();
        Shape line = new Line();

        // 도형 연결 (Circle -> Rect -> Line)
        circle.setNext(rect);
        rect.setNext(line);

        // 도형 순서대로 출력
        Shape current = circle;
        while (current != null) {
            current.draw(); // 현재 도형 출력
            current = current.getNext(); // 다음 도형으로 이동
        }

    }

}

abstract class Shape {
    private Shape next;

    public void setNext(Shape obj) {
        next = obj; // 연결 리스트, 주소값 받기
    }

    public Shape getNext() {
        return next;
    }

    public abstract void draw();
}

class Circle extends Shape {

    public Circle() {
        // 기본 생성자
    }

    public void draw() {
        System.out.println("원을 그립니다.");
    }
}

class Rect extends Shape {

    public Rect() {
        // 기본 생성자
    }

    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}

class Line extends Shape {

    public Line() {
        // 기본 생성자
    }

    public void draw() {
        System.out.println("선을 그립니다.");
    }
}
