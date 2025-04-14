package Additional_problems;

public class chater5_5 {
    public static void main(String[] args) {

        // 3차원의 점을 나타내는 3d point 클래스 작성
        Point3D p = new Point3D(3, 2, 1);
        System.out.println(p.tostring() + "입니다.");

        p.moveup(3);
        System.out.println(p.tostring() + "입니다.");
        p.movedown(2);
        System.out.println(p.tostring() + "입니다.");
        p.move(5, 5);
        System.out.println(p.tostring() + "입니다.");
        p.move(100, 200, 300);
        System.out.println(p.tostring() + "입니다.");
    }

}

class Point {
    int x;
    int y;
    int z;

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}

class Point3D extends Point {

    Point3D(int x, int y, int z) {
        super(x, y, z);
    }

    void moveup(int z) {
        this.z += z;
    }

    void movedown(int z) {
        this.z -= z;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
    /*
     * 에러 : System.out.println(p.tostring() + "입니다."); 에서 출력값이 있어야 하는데
     * void 라 리턴값이 없기에 출력에 에러가 생겨버림
     * 
     * + 위에 처럼 그냥 메서드에서 해결하는 moveup(3); 이렇게 쓰지않는 이상 문제가 생겨버림
     * 
     * void tostring()
     * {
     * System.out.printf("(%d %d %d)의 점",this.x,this.y,this.z);
     * }
     */

    String tostring() {
        return String.format("(%d,%d,%d)의 점", this.x, this.y, this.z);
    }

}