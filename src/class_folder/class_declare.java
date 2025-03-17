package class_folder;

public class class_declare {

    // class 선언
    public static class circle {
        int radious = 1;
        String name = "";
    }

    public static void main(String args[]) {
        // class 선언할때 static으로 하면 아래와 같이 참조 변수를 만듬과 동시에
        // 바로 선언까지 가능
        circle my = new circle();

        // stastic을 사용하지 않는 경우
        /*
         * class_declare declare = new class_declare; //인스턴스 생성
         * 
         * my = declare.new circle(); // 인스턴스를 참조하면서 선언
         * 
         */

    }
}
