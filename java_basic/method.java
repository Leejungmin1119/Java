public class method {

    public static void main(String[] args) {
        
        print();//메소드 호출

        //반환값

        int num = return_add_number(10);


    }
    // 메소드 정의
    public static void print() {
        System.out.println("출력됨");
    }

    // static 뒤에 있는 자료형이 바로 반환값이다
    public static int return_add_number(int a) 
    {
        //반환값을 선언하면 무조건 return이 있어야 한다.
        return a;
        
    }

}
