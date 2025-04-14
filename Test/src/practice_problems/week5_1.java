package practice_problems;

public class week5_1 {
    public static void main(String[] args) {

        // 생성
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        // 출력
        iptv.printProperty();
    }
}

class TV {

    // 사이즈 생성
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

// 컬러의 정보가 담긴 티비 클래스 상속
class ColorTV extends TV {

    private int color;

    public ColorTV(int color, int size) {
        super(size);// 한개의 생성자를 가지는 슈퍼클래스의 생성자 불러오기
        this.color = color;
    }

    // private 함수는 다른 클래스에 접근이 불가능 하므로, 이렇게 함수를 만들고 return값에 해당 변수를 넣음으로서
    // 값을 불러온다.
    public int getcolor() {
        return color;
    }

}

class IPTV extends ColorTV {
    String ip;

    // 1. ip,size, color 총 3개의 변수는 만드는 생성자 생성
    public IPTV(String ip, int size, int color) {

        // ! super는 무조건 생성자 함수 첫줄에다가 만들어야 함
        super(color, size); // 두개의 생성자를 가지는 슈퍼 클래스의 생성자 불러오기.
        this.ip = ip;

    }

    // 최종 출력
    public void printProperty() {
        System.out.println("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + getcolor() + "컬러");
    }
}
