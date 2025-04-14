package Additional_problems;

public class chater5_1 {
    public static void main(String[] args) {
        ColorTv mytv = new ColorTv(65, 65536);
        mytv.printProperty();

    }

}

class MyTv {
    int inch;
}

class ColorTv extends MyTv {
    int color;

    public ColorTv(int inch, int color) {
        this.color = color;
        this.inch = inch;
    }

    void printProperty() {
        System.out.printf("%d인치 %d컬러", inch, color);
    }

}
